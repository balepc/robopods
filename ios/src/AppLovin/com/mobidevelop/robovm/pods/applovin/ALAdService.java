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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAdService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALAdServicePtr extends Ptr<ALAdService, ALAdServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAdService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALAdService() {}
    protected ALAdService(Handle h, long handle) { super(h, handle); }
    protected ALAdService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadNextAd:andNotify:")
    public native void loadNextAd$andNotify$(ALAdSize adSize, ALAdLoadDelegate delegate);
    @Method(selector = "loadNextAdForZoneIdentifier:andNotify:")
    public native void loadNextAdForZoneIdentifier$andNotify$(String zoneIdentifier, ALAdLoadDelegate delegate);
    @Method(selector = "addAdUpdateObserver:ofSize:")
    public native void addAdUpdateObserver$ofSize$(ALAdUpdateObserver adListener, ALAdSize adSize);
    @Method(selector = "removeAdUpdateObserver:ofSize:")
    public native void removeAdUpdateObserver$ofSize$(ALAdUpdateObserver adListener, ALAdSize adSize);
    @Method(selector = "loadNextAdForAdToken:andNotify:")
    public native void loadNextAdForAdToken$andNotify$(String adToken, ALAdLoadDelegate delegate);
    @Method(selector = "loadNextAdForZoneIdentifiers:andNotify:")
    public native void loadNextAdForZoneIdentifiers$andNotify$(NSArray<NSString> zoneIdentifiers, ALAdLoadDelegate delegate);
    @Method(selector = "preloadAdOfSize:")
    public native void preloadAdOfSize(ALAdSize adSize);
    @Method(selector = "preloadAdForZoneIdentifier:")
    public native void preloadAdForZoneIdentifier(String zoneIdentifier);
    @Method(selector = "hasPreloadedAdOfSize:")
    public native boolean hasPreloadedAdOfSize(ALAdSize adSize);
    @Method(selector = "hasPreloadedAdForZoneIdentifier:")
    public native boolean hasPreloadedAdForZoneIdentifier(String zoneIdentifier);
    /*</methods>*/
}
