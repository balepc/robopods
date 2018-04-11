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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPAdConfigurationLogEventProperties/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPAdConfigurationLogEventPropertiesPtr extends Ptr<MPAdConfigurationLogEventProperties, MPAdConfigurationLogEventPropertiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPAdConfigurationLogEventProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPAdConfigurationLogEventProperties() {}
    protected MPAdConfigurationLogEventProperties(Handle h, long handle) { super(h, handle); }
    protected MPAdConfigurationLogEventProperties(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfiguration:")
    public MPAdConfigurationLogEventProperties(MPAdConfiguration configuration) { super((SkipInit) null); initObject(initWithConfiguration(configuration)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adType")
    public native String getAdType();
    @Property(selector = "setAdType:")
    public native void setAdType(String v);
    @Property(selector = "adCreativeId")
    public native String getAdCreativeId();
    @Property(selector = "setAdCreativeId:")
    public native void setAdCreativeId(String v);
    @Property(selector = "dspCreativeId")
    public native String getDspCreativeId();
    @Property(selector = "setDspCreativeId:")
    public native void setDspCreativeId(String v);
    @Property(selector = "adNetworkType")
    public native String getAdNetworkType();
    @Property(selector = "setAdNetworkType:")
    public native void setAdNetworkType(String v);
    @Property(selector = "adSize")
    public native @ByVal CGSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(@ByVal CGSize v);
    @Property(selector = "requestId")
    public native String getRequestId();
    @Property(selector = "setRequestId:")
    public native void setRequestId(String v);
    @Property(selector = "adUnitId")
    public native String getAdUnitId();
    @Property(selector = "setAdUnitId:")
    public native void setAdUnitId(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfiguration:")
    protected native @Pointer long initWithConfiguration(MPAdConfiguration configuration);
    /*</methods>*/
}
