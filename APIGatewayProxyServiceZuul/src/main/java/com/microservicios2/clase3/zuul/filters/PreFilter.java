package com.microservicios2.clase3.zuul.filters;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter{

@Override
public Object run() throws ZuulException {
	RequestContext ctx = RequestContext.getCurrentContext();
	HttpServletRequest request = ctx.getRequest();
	if(request.getAttribute("AUTH_HEADER")==null) {
		// genera u obtiene el AUTH_TOKEN, ex de Spring Session repository
		String sessionold = UUID.randomUUID().toString();
		ctx.addZuulRequestHeader("AUTH_HEADER", sessionold);
	}
	
	System.out.println("Estor en PreFilter " + request.getMethod() + " Request URL "+ request.getRequestURL().toString());
	return null;
}

@Override
public boolean shouldFilter() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public String filterType() {
	// TODO Auto-generated method stub
	return "pre";
}

@Override
public int filterOrder() {
	// TODO Auto-generated method stub
	return 1;
}

}
