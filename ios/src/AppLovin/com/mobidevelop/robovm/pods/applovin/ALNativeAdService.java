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
package com.mobidevelop.robovm.pods.applovin;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALNativeAdService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALNativeAdServicePtr extends Ptr<ALNativeAdService, ALNativeAdServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALNativeAdService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALNativeAdService() {}
    protected ALNativeAdService(Handle h, long handle) { super(h, handle); }
    protected ALNativeAdService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadNativeAdGroupOfCount:andNotify:")
    public native void loadNativeAdGroupOfCount$andNotify$(@MachineSizedUInt long numberOfAdsToLoad, ALNativeAdLoadDelegate delegate);
    @Method(selector = "loadNativeAdGroupOfCount:forZoneIdentifier:andNotify:")
    public native void loadNativeAdGroupOfCount$forZoneIdentifier$andNotify$(@MachineSizedUInt long numberOfAdsToLoad, String zoneIdentifier, ALNativeAdLoadDelegate delegate);
    @Method(selector = "precacheResourcesForNativeAd:andNotify:")
    public native void precacheResourcesForNativeAd$andNotify$(ALNativeAd ad, ALNativeAdPrecacheDelegate delegate);
    @Method(selector = "preloadAdForZoneIdentifier:")
    public native void preloadAdForZoneIdentifier(String zoneIdentifier);
    @Method(selector = "hasPreloadedAdForZoneIdentifier:")
    public native boolean hasPreloadedAdForZoneIdentifier(String zoneIdentifier);
    /*</methods>*/
}
