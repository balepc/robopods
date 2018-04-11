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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALInterstitialAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALInterstitialAdPtr extends Ptr<ALInterstitialAd, ALInterstitialAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALInterstitialAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALInterstitialAd() {}
    protected ALInterstitialAd(Handle h, long handle) { super(h, handle); }
    protected ALInterstitialAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSdk:")
    public ALInterstitialAd(ALSdk sdk) { super((SkipInit) null); initObject(initWithSdk(sdk)); }
    @Method(selector = "initWithFrame:sdk:")
    public ALInterstitialAd(@ByVal CGRect frame, ALSdk sdk) { super((SkipInit) null); initObject(initWithFrame$sdk$(frame, sdk)); }
    @Method(selector = "initInterstitialAdWithSdk:")
    public ALInterstitialAd(ALSdk sdk) { super((SkipInit) null); initObject(initInterstitialAdWithSdk(sdk)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adLoadDelegate")
    public native ALAdLoadDelegate getAdLoadDelegate();
    @Property(selector = "setAdLoadDelegate:")
    public native void setAdLoadDelegate(ALAdLoadDelegate v);
    @Property(selector = "adDisplayDelegate")
    public native ALAdDisplayDelegate getAdDisplayDelegate();
    @Property(selector = "setAdDisplayDelegate:")
    public native void setAdDisplayDelegate(ALAdDisplayDelegate v);
    @Property(selector = "adVideoPlaybackDelegate")
    public native ALAdVideoPlaybackDelegate getAdVideoPlaybackDelegate();
    @Property(selector = "setAdVideoPlaybackDelegate:")
    public native void setAdVideoPlaybackDelegate(ALAdVideoPlaybackDelegate v);
    @Property(selector = "frame")
    public native @ByVal CGRect getFrame();
    @Property(selector = "setFrame:")
    public native void setFrame(@ByVal CGRect v);
    @Property(selector = "hidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @Property(selector = "isReadyForDisplay")
    public native boolean isReadyForDisplay();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "show")
    public native void show();
    @Method(selector = "showOver:")
    public native void showOver(UIWindow window);
    @Method(selector = "showOver:andRender:")
    public native void showOver$andRender$(UIWindow window, ALAd ad);
    @Method(selector = "dismiss")
    public native void dismiss();
    @Method(selector = "initWithSdk:")
    protected native @Pointer long initWithSdk(ALSdk sdk);
    @Method(selector = "initWithFrame:sdk:")
    protected native @Pointer long initWithFrame$sdk$(@ByVal CGRect frame, ALSdk sdk);
    @Method(selector = "show")
    public static native ALInterstitialAd show();
    @Method(selector = "showOver:")
    public static native ALInterstitialAd showOver(UIWindow window);
    @Method(selector = "shared")
    public static native ALInterstitialAd shared();
    @Method(selector = "initInterstitialAdWithSdk:")
    protected native @Pointer long initInterstitialAdWithSdk(ALSdk sdk);
    @Method(selector = "showOverPlacement:")
    public native void showOverPlacement(String placement);
    @Method(selector = "showOver:placement:andRender:")
    public native void showOver$placement$andRender$(UIWindow window, String placement, ALAd ad);
    @Method(selector = "showOverPlacement:")
    public static native ALInterstitialAd showOverPlacement(String placement);
    @Method(selector = "showOver:placement:")
    public static native ALInterstitialAd showOver$placement$(UIWindow window, String placement);
    @Method(selector = "isReadyForDisplay")
    public static native boolean isReadyForDisplay();
    /*</methods>*/
}
