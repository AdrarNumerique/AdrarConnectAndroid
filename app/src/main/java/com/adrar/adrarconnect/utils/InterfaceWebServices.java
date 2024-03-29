package com.adrar.adrarconnect.utils;

//
// Created by FERRARIS Philippe on 27/06/2019 for adrarConnect.
//

import com.adrar.adrarconnect.data.model.AccueilBean;
import com.adrar.adrarconnect.data.model.DocumentsBean;
import com.adrar.adrarconnect.data.model.InfocoUserBean;
import com.adrar.adrarconnect.data.model.LoginBean;
import com.adrar.adrarconnect.data.model.SigninBean;
import com.adrar.adrarconnect.data.model.UpdateUserBean;
import com.adrar.adrarconnect.data.model.UserBean;
import com.adrar.adrarconnect.data.staticData.Constants;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface InterfaceWebServices {

    @GET(Constants.URL_ACCUEIL)
    Call<AccueilBean> getAccueilData();

    @POST(Constants.URL_SIGNIN)
    Call<UserBean> postUserSignin(@Body SigninBean signinBean);

    @POST(Constants.URL_LOGIN)
    Call<UserBean> postUserLogin(@Body LoginBean loginBean);

    @POST(Constants.URL_CANDIDAT_UPDATE_DETAILS)
    Call<UserBean> postUserUpdateDetails(@Body UpdateUserBean updateUserBean);

    @POST(Constants.URL_CANDIDAT_UPDATE_DOCUMENT)
    Call<UserBean> postUserDocument(@Body DocumentsBean documentsBean);

    @POST(Constants.URL_INFOCOL_INSCRIPTION)
    Call<UserBean> postUserInfoco(@Body InfocoUserBean infocoUserBean);

    @POST(Constants.URL_INFOCOL_MODIFICATION)
    Call<UserBean> postUserUpdateInfoco(@Body InfocoUserBean infocoUserBean);

    @POST(Constants.URL_INFOCOL_ANNULATION)
    Call<UserBean> postUserDeleteInfoco(@Body InfocoUserBean infocoUserBean);
}
