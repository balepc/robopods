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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPInterstitialCustomEventDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPInterstitialCustomEventDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("location")
    public CLLocation location() { return null; }
    @NotImplemented("interstitialCustomEvent:didLoadAd:")
    public void interstitialCustomEvent$didLoadAd$(MPInterstitialCustomEvent customEvent, NSObject ad) {}
    @NotImplemented("interstitialCustomEvent:didFailToLoadAdWithError:")
    public void interstitialCustomEvent$didFailToLoadAdWithError$(MPInterstitialCustomEvent customEvent, NSError error) {}
    @NotImplemented("interstitialCustomEventDidExpire:")
    public void interstitialCustomEventDidExpire(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventWillAppear:")
    public void interstitialCustomEventWillAppear(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventDidAppear:")
    public void interstitialCustomEventDidAppear(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventWillDisappear:")
    public void interstitialCustomEventWillDisappear(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventDidDisappear:")
    public void interstitialCustomEventDidDisappear(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventDidReceiveTapEvent:")
    public void interstitialCustomEventDidReceiveTapEvent(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventWillLeaveApplication:")
    public void interstitialCustomEventWillLeaveApplication(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("trackImpression")
    public void trackImpression() {}
    @NotImplemented("trackClick")
    public void trackClick() {}
    /*</methods>*/
}
