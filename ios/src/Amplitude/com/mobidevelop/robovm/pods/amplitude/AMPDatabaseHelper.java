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
package com.mobidevelop.robovm.pods.amplitude;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AMPDatabaseHelper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AMPDatabaseHelperPtr extends Ptr<AMPDatabaseHelper, AMPDatabaseHelperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AMPDatabaseHelper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AMPDatabaseHelper() {}
    protected AMPDatabaseHelper(Handle h, long handle) { super(h, handle); }
    protected AMPDatabaseHelper(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "databasePath")
    public native String getDatabasePath();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "createTables")
    public native boolean createTables();
    @Method(selector = "dropTables")
    public native boolean dropTables();
    @Method(selector = "upgrade:newVersion:")
    public native boolean upgrade$newVersion$(int oldVersion, int newVersion);
    @Method(selector = "resetDB:")
    public native boolean resetDB(boolean deleteDB);
    @Method(selector = "deleteDB")
    public native boolean deleteDB();
    @Method(selector = "addEvent:")
    public native boolean addEvent(String event);
    @Method(selector = "addIdentify:")
    public native boolean addIdentify(String identify);
    @Method(selector = "getEvents:limit:")
    public native NSMutableArray<?> getEvents$limit$(long upToId, long limit);
    @Method(selector = "getIdentifys:limit:")
    public native NSMutableArray<?> getIdentifys$limit$(long upToId, long limit);
    @Method(selector = "getEventCount")
    public native int getEventCount();
    @Method(selector = "getIdentifyCount")
    public native int getIdentifyCount();
    @Method(selector = "getTotalEventCount")
    public native int getTotalEventCount();
    @Method(selector = "removeEvents:")
    public native boolean removeEvents(long maxId);
    @Method(selector = "removeIdentifys:")
    public native boolean removeIdentifys(long maxIdentifyId);
    @Method(selector = "removeEvent:")
    public native boolean removeEvent(long eventId);
    @Method(selector = "removeIdentify:")
    public native boolean removeIdentify(long identifyId);
    @Method(selector = "getNthEventId:")
    public native long getNthEventId(long n);
    @Method(selector = "getNthIdentifyId:")
    public native long getNthIdentifyId(long n);
    @Method(selector = "insertOrReplaceKeyValue:value:")
    public native boolean insertOrReplaceKeyValue$value$(String key, String value);
    @Method(selector = "insertOrReplaceKeyLongValue:value:")
    public native boolean insertOrReplaceKeyLongValue$value$(String key, NSNumber value);
    @Method(selector = "getValue:")
    public native String getValue(String key);
    @Method(selector = "getLongValue:")
    public native NSNumber getLongValue(String key);
    @Method(selector = "getDatabaseHelper")
    public static native AMPDatabaseHelper getDatabaseHelper();
    @Method(selector = "getDatabaseHelper:")
    public static native AMPDatabaseHelper getDatabaseHelper(String instanceName);
    /*</methods>*/
}
