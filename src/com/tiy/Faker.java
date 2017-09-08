package com.tiy;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NamingException;
import javax.naming.spi.ResolveResult;
import javax.naming.spi.Resolver;

public class Faker extends Object implements Resolver {
    @Override
    public ResolveResult resolveToClass(Name name, Class<? extends Context> contextType) throws NamingException {
        return null;
    }

    @Override
    public ResolveResult resolveToClass(String name, Class<? extends Context> contextType) throws NamingException {
        return null;
    }
}
