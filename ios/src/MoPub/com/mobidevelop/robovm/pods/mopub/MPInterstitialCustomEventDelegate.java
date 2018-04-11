/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mobidevelop.robovm.pods.mopub;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPInterstitialCustomEventDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "location")
    CLLocation location();
    @Method(selector = "interstitialCustomEvent:didLoadAd:")
    void interstitialCustomEvent$didLoadAd$(MPInterstitialCustomEvent customEvent, NSObject ad);
    @Method(selector = "interstitialCustomEvent:didFailToLoadAdWithError:")
    void interstitialCustomEvent$didFailToLoadAdWithError$(MPInterstitialCustomEvent customEvent, NSError error);
    @Method(selector = "interstitialCustomEventDidExpire:")
    void interstitialCustomEventDidExpire(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventWillAppear:")
    void interstitialCustomEventWillAppear(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventDidAppear:")
    void interstitialCustomEventDidAppear(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventWillDisappear:")
    void interstitialCustomEventWillDisappear(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventDidDisappear:")
    void interstitialCustomEventDidDisappear(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventDidReceiveTapEvent:")
    void interstitialCustomEventDidReceiveTapEvent(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventWillLeaveApplication:")
    void interstitialCustomEventWillLeaveApplication(MPInterstitialCustomEvent customEvent);
    @Method(selector = "trackImpression")
    void trackImpression();
    @Method(selector = "trackClick")
    void trackClick();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
