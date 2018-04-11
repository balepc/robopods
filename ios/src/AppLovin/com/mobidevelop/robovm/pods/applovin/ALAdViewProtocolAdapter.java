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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAdViewProtocolAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ALAdViewProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("adLoadDelegate")
    public ALAdLoadDelegate getAdLoadDelegate() { return null; }
    @NotImplemented("setAdLoadDelegate:")
    public void setAdLoadDelegate(ALAdLoadDelegate v) {}
    @NotImplemented("adDisplayDelegate")
    public ALAdDisplayDelegate getAdDisplayDelegate() { return null; }
    @NotImplemented("setAdDisplayDelegate:")
    public void setAdDisplayDelegate(ALAdDisplayDelegate v) {}
    @NotImplemented("adEventDelegate")
    public ALAdViewEventDelegate getAdEventDelegate() { return null; }
    @NotImplemented("setAdEventDelegate:")
    public void setAdEventDelegate(ALAdViewEventDelegate v) {}
    @NotImplemented("adVideoPlaybackDelegate")
    public ALAdVideoPlaybackDelegate getAdVideoPlaybackDelegate() { return null; }
    @NotImplemented("setAdVideoPlaybackDelegate:")
    public void setAdVideoPlaybackDelegate(ALAdVideoPlaybackDelegate v) {}
    @NotImplemented("adSize")
    public ALAdSize getAdSize() { return null; }
    @NotImplemented("setAdSize:")
    public void setAdSize(ALAdSize v) {}
    @NotImplemented("zoneIdentifier")
    public String getZoneIdentifier() { return null; }
    @NotImplemented("isAutoloadEnabled")
    public boolean isAutoload() { return false; }
    @NotImplemented("setAutoloadEnabled:")
    public void setAutoload(boolean v) {}
    @NotImplemented("isAutoloadEnabled")
    public boolean shouldAutoload() { return false; }
    @NotImplemented("setAutoloadEnabled:")
    public void setShouldAutoload(boolean v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("loadNextAd")
    public void loadNextAd() {}
    @NotImplemented("render:")
    public void render(ALAd ad) {}
    /*</methods>*/
}
