//package com.tactfactory.microservice.zuul;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//
//public class ZuulLoggingFilter extends ZuulFilter {
//
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	@Override
//	public boolean shouldFilter() {
//		return true;
//	}
//
//	@Override
//	public Object run() {
//		// getting the current HTTP request that is to be handle
//		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
//		// printing the detail of the request
//		logger.info("request -> {} request uri-> {}", request, request.getRequestURI());
//		return null;
//	}
//
//	@Override
//	public String filterType() {
//		return "pre";
//	}
//
//	@Override
//	public int filterOrder() {
//		return 1;
//	}
//}
