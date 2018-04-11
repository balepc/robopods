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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNativeAdRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNativeAdRequestPtr extends Ptr<MPNativeAdRequest, MPNativeAdRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNativeAdRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPNativeAdRequest() {}
    protected MPNativeAdRequest(Handle h, long handle) { super(h, handle); }
    protected MPNativeAdRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "targeting")
    public native MPNativeAdRequestTargeting getTargeting();
    @Property(selector = "setTargeting:")
    public native void setTargeting(MPNativeAdRequestTargeting v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startWithCompletionHandler:")
    public native void startWithCompletionHandler(@Block VoidBlock3<MPNativeAdRequest, MPNativeAd, NSError> handler);
    @Method(selector = "requestWithAdUnitIdentifier:rendererConfigurations:")
    public static native MPNativeAdRequest requestWithAdUnitIdentifier$rendererConfigurations$(String identifier, NSArray<?> rendererConfigurations);
    /*</methods>*/
}
