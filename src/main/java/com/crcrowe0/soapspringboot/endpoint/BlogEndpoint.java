package com.crcrowe0.soapspringboot.endpoint;

import com.crcrowe0.soap_springboot.GetBlogRequest;
import com.crcrowe0.soap_springboot.GetBlogResponse;
import com.crcrowe0.soapspringboot.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BlogEndpoint {

    @Autowired
    private BlogService blogService;

    @PayloadRoot(namespace="http://crcrowe0.com/soap-springboot",
            localPart="getBlogRequest")
    @ResponsePayload
    public GetBlogResponse getBlogRequest(@RequestPayload GetBlogRequest request) {
        GetBlogResponse response = new GetBlogResponse();
        response.setBlog(blogService.getBlog(request.getTitle()));
        return response;
    }
}
