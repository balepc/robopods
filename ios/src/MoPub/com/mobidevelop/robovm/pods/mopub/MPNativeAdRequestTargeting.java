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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNativeAdRequestTargeting/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNativeAdRequestTargetingPtr extends Ptr<MPNativeAdRequestTargeting, MPNativeAdRequestTargetingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNativeAdRequestTargeting.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPNativeAdRequestTargeting() {}
    protected MPNativeAdRequestTargeting(Handle h, long handle) { super(h, handle); }
    protected MPNativeAdRequestTargeting(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keywords")
    public native String getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(String v);
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    @Property(selector = "desiredAssets")
    public native NSSet<?> getDesiredAssets();
    @Property(selector = "setDesiredAssets:")
    public native void setDesiredAssets(NSSet<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "targeting")
    public static native MPNativeAdRequestTargeting targeting();
    /*</methods>*/
}
