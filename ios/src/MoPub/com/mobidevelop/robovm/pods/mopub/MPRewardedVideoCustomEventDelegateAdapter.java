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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPRewardedVideoCustomEventDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPRewardedVideoCustomEventDelegate/*</implements>*/ {

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
    @NotImplemented("instanceMediationSettingsForClass:")
    public MPMediationSettingsProtocol instanceMediationSettingsForClass(Class<?> aClass) { return null; }
    @NotImplemented("rewardedVideoDidLoadAdForCustomEvent:")
    public void rewardedVideoDidLoadAdForCustomEvent(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidFailToLoadAdForCustomEvent:error:")
    public void rewardedVideoDidFailToLoadAdForCustomEvent$error$(MPRewardedVideoCustomEvent customEvent, NSError error) {}
    @NotImplemented("rewardedVideoDidExpireForCustomEvent:")
    public void rewardedVideoDidExpireForCustomEvent(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidFailToPlayForCustomEvent:error:")
    public void rewardedVideoDidFailToPlayForCustomEvent$error$(MPRewardedVideoCustomEvent customEvent, NSError error) {}
    @NotImplemented("rewardedVideoWillAppearForCustomEvent:")
    public void rewardedVideoWillAppearForCustomEvent(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidAppearForCustomEvent:")
    public void rewardedVideoDidAppearForCustomEvent(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoWillDisappearForCustomEvent:")
    public void rewardedVideoWillDisappearForCustomEvent(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidDisappearForCustomEvent:")
    public void rewardedVideoDidDisappearForCustomEvent(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoWillLeaveApplicationForCustomEvent:")
    public void rewardedVideoWillLeaveApplicationForCustomEvent(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidReceiveTapEventForCustomEvent:")
    public void rewardedVideoDidReceiveTapEventForCustomEvent(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoShouldRewardUserForCustomEvent:reward:")
    public void rewardedVideoShouldRewardUserForCustomEvent$reward$(MPRewardedVideoCustomEvent customEvent, MPRewardedVideoReward reward) {}
    @NotImplemented("customerIdForRewardedVideoCustomEvent:")
    public String customerIdForRewardedVideoCustomEvent(MPRewardedVideoCustomEvent customEvent) { return null; }
    @NotImplemented("trackImpression")
    public void trackImpression() {}
    @NotImplemented("trackClick")
    public void trackClick() {}
    /*</methods>*/
}
