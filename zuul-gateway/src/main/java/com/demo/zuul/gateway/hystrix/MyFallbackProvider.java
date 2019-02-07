//package com.demo.zuul.gateway.hystrix;
//
//import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.client.ClientHttpResponse;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//
///**
// * MyFallbackProvider
// *
// * @author 10905 2019/2/7
// * @version 1.0
// */
//public class MyFallbackProvider implements ZuulFallbackProvider {
//    /**
//     * 返回路由器的名称
//     * @return
//     */
//    @Override
//    public String getRoute() {
//        System.out.println("返回路由器的名称:zuul-sale-service");
//        return "zuul-sale-service";
//    }
//
//    /**
//     * 回退触发
//     * @return
//     */
//    @Override
//    public ClientHttpResponse fallbackResponse() {
//        return new ClientHttpResponse() {
//            @Override
//            public HttpStatus getStatusCode() throws IOException {
//                System.out.println("响应状态码");
//                return HttpStatus.OK;
//            }
//
//            @Override
//            public int getRawStatusCode() throws IOException {
//                System.out.println("设置状态码---200");
//                return 200;
//            }
//
//            @Override
//            public String getStatusText() throws IOException {
//                return null;
//            }
//
//            @Override
//            public void close() {
//
//            }
//
//            @Override
//            public InputStream getBody() throws IOException {
//                System.out.println("---------进入getBody()---------");
//                return new ByteArrayInputStream("fallback".getBytes());
//            }
//
//            @Override
//            public HttpHeaders getHeaders() {
//                System.out.println("-----getHeaders()设置响应类型------");
//                HttpHeaders headers=new HttpHeaders();
//                headers.setContentType(MediaType.TEXT_PLAIN);
//                return headers;
//            }
//        };
//
//    }
//}
