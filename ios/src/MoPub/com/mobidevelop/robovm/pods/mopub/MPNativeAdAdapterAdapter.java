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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNativeAdAdapterAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPNativeAdAdapter/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("properties")
    public NSDictionary<?, ?> getProperties() { return null; }
    @NotImplemented("defaultActionURL")
    public NSURL getDefaultActionURL() { return null; }
    @NotImplemented("delegate")
    public MPNativeAdAdapterDelegate getDelegate() { return null; }
    @NotImplemented("setDelegate:")
    public void setDelegate(MPNativeAdAdapterDelegate v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("displayContentForURL:rootViewController:")
    public void displayContentForURL$rootViewController$(NSURL URL, UIViewController controller) {}
    @NotImplemented("enableThirdPartyClickTracking")
    public boolean enableThirdPartyClickTracking() { return false; }
    @NotImplemented("trackClick")
    public void trackClick() {}
    @NotImplemented("willAttachToView:")
    public void willAttachToView(UIView view) {}
    @NotImplemented("willAttachToView:withAdContentViews:")
    public void willAttachToView$withAdContentViews$(UIView view, NSArray<?> adContentViews) {}
    @NotImplemented("displayContentForDAAIconTap")
    public void displayContentForDAAIconTap() {}
    @NotImplemented("privacyInformationIconView")
    public UIView privacyInformationIconView() { return null; }
    @NotImplemented("mainMediaView")
    public UIView mainMediaView() { return null; }
    /*</methods>*/
}
