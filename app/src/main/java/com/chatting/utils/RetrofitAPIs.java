package com.chatting.utils;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2018/1/3.
 */

public interface RetrofitAPIs {
    //get请求   使用@Query修饰参数
    /*@GET("user/login")
    Observable<LoginBean> loginGET(@Query("mobile") String mobile, @Query("password") String password);

    //首页无参数
    @GET("ad/getAd")
    Observable<FirstPageBean> firstPageGET();

    //分类左recyclerView的接口无参数
    @GET("product/getCatagory")
    Observable<LeftBean> classLeftGET();

    //分类右recyclerView的接口
    @GET("product/getProductCatagory")
    Observable<RightBean> classRightGET(@Query("cid") int cid);

    //分类右recyclerView的Details详情列表的接口
    @GET("product/getProducts")
    Observable<RightDetailsBean> classRightDetailsGET(@Query("pscid") String pscid);

    //分类右recyclerView的details详情列表的子详情接口
    @GET("product/getProductDetail")
    Observable<RightDetailsItemBean> classRDetailsItemGet(@Query("pid") String pid);

    //添加购物车接口
    @GET("product/addCart")
    Observable<InsertCartBean> insertCartGet(@Query("uid") String uid, @Query("pid") String pid, @Query("sellerid") String sellerid);

    //查询购物车接口
    @GET("product/getCarts")
    Observable<QueryCartBean> queryCartGet(@Query("uid") int userUid);*/


}
