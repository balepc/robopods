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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPRewardedVideoReward/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPRewardedVideoRewardPtr extends Ptr<MPRewardedVideoReward, MPRewardedVideoRewardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPRewardedVideoReward.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPRewardedVideoReward() {}
    protected MPRewardedVideoReward(Handle h, long handle) { super(h, handle); }
    protected MPRewardedVideoReward(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCurrencyAmount:")
    public MPRewardedVideoReward(NSNumber amount) { super((SkipInit) null); initObject(initWithCurrencyAmount(amount)); }
    @Method(selector = "initWithCurrencyType:amount:")
    public MPRewardedVideoReward(String currencyType, NSNumber amount) { super((SkipInit) null); initObject(initWithCurrencyType$amount$(currencyType, amount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "currencyType")
    public native String getCurrencyType();
    @Property(selector = "amount")
    public native NSNumber getAmount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCurrencyAmount:")
    protected native @Pointer long initWithCurrencyAmount(NSNumber amount);
    @Method(selector = "initWithCurrencyType:amount:")
    protected native @Pointer long initWithCurrencyType$amount$(String currencyType, NSNumber amount);
    /*</methods>*/
}
