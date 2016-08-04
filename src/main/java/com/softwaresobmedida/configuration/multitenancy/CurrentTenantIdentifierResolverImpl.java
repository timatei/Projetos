package com.softwaresobmedida.configuration.multitenancy;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

import com.softwaresobmedida.security.UtilSecurity;

@Component
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

	public static final String TENANT_MASTER = "MASTER";	
	public static final String TENANT_1 = "bd1";
	public static final String TENANT_2 = "bd2";

	@Override
	public String resolveCurrentTenantIdentifier() {
		return UtilSecurity.getBancoAtual();
	}

	@Override
	public boolean validateExistingCurrentSessions() {
		return true;
	}
}