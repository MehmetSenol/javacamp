package com.Odev5.core.cocnretes;

import com.Odev5.JGoogleLog.GoogleLogin;
import com.Odev5.core.abstracts.GoogleService;

public class GoogleLoginManager implements GoogleService {
    @Override
    public void googleLoginToSystem(String email, String password) {
        GoogleLogin googleLogin=new GoogleLogin();
        googleLogin.add(email,password);

    }
}
