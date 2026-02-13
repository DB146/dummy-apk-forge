package com.kt.apps.core.update;

import A3.c;
import H8.b;
import androidx.annotation.Keep;
import h3.o;
import kotlin.jvm.internal.l;

@Keep
/* loaded from: classes2.dex */
public final class UpdateDTO {

    @b("force_update_from_version")
    private final long forceUpdateFromVersion;

    @b("md5")
    private final String md5;

    @b("newest_version")
    private final long newestVersion;

    @b("newest_version_name")
    private final String newestVersionName;

    @b("update_change_log")
    private final String updateChangeLog;

    @b("update_description")
    private final String updateDescription;

    @b("update_priority")
    private final int updatePriority;

    @b("update_title")
    private final String updateTitle;

    @b("update_url")
    private final String updateUrl;

    public UpdateDTO(long j, long j10, String updateChangeLog, String updateDescription, int i7, String updateTitle, String updateUrl, String newestVersionName, String md5) {
        l.e(updateChangeLog, "updateChangeLog");
        l.e(updateDescription, "updateDescription");
        l.e(updateTitle, "updateTitle");
        l.e(updateUrl, "updateUrl");
        l.e(newestVersionName, "newestVersionName");
        l.e(md5, "md5");
        this.forceUpdateFromVersion = j;
        this.newestVersion = j10;
        this.updateChangeLog = updateChangeLog;
        this.updateDescription = updateDescription;
        this.updatePriority = i7;
        this.updateTitle = updateTitle;
        this.updateUrl = updateUrl;
        this.newestVersionName = newestVersionName;
        this.md5 = md5;
    }

    public final long component1() {
        return this.forceUpdateFromVersion;
    }

    public final long component2() {
        return this.newestVersion;
    }

    public final String component3() {
        return this.updateChangeLog;
    }

    public final String component4() {
        return this.updateDescription;
    }

    public final int component5() {
        return this.updatePriority;
    }

    public final String component6() {
        return this.updateTitle;
    }

    public final String component7() {
        return this.updateUrl;
    }

    public final String component8() {
        return this.newestVersionName;
    }

    public final String component9() {
        return this.md5;
    }

    public final UpdateDTO copy(long j, long j10, String updateChangeLog, String updateDescription, int i7, String updateTitle, String updateUrl, String newestVersionName, String md5) {
        l.e(updateChangeLog, "updateChangeLog");
        l.e(updateDescription, "updateDescription");
        l.e(updateTitle, "updateTitle");
        l.e(updateUrl, "updateUrl");
        l.e(newestVersionName, "newestVersionName");
        l.e(md5, "md5");
        return new UpdateDTO(j, j10, updateChangeLog, updateDescription, i7, updateTitle, updateUrl, newestVersionName, md5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateDTO)) {
            return false;
        }
        UpdateDTO updateDTO = (UpdateDTO) obj;
        return this.forceUpdateFromVersion == updateDTO.forceUpdateFromVersion && this.newestVersion == updateDTO.newestVersion && l.a(this.updateChangeLog, updateDTO.updateChangeLog) && l.a(this.updateDescription, updateDTO.updateDescription) && this.updatePriority == updateDTO.updatePriority && l.a(this.updateTitle, updateDTO.updateTitle) && l.a(this.updateUrl, updateDTO.updateUrl) && l.a(this.newestVersionName, updateDTO.newestVersionName) && l.a(this.md5, updateDTO.md5);
    }

    public final long getForceUpdateFromVersion() {
        return this.forceUpdateFromVersion;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final long getNewestVersion() {
        return this.newestVersion;
    }

    public final String getNewestVersionName() {
        return this.newestVersionName;
    }

    public final String getUpdateChangeLog() {
        return this.updateChangeLog;
    }

    public final String getUpdateDescription() {
        return this.updateDescription;
    }

    public final int getUpdatePriority() {
        return this.updatePriority;
    }

    public final String getUpdateTitle() {
        return this.updateTitle;
    }

    public final String getUpdateUrl() {
        return this.updateUrl;
    }

    public int hashCode() {
        return this.md5.hashCode() + c.d(c.d(c.d(c.c(this.updatePriority, c.d(c.d(o.f(Long.hashCode(this.forceUpdateFromVersion) * 31, 31, this.newestVersion), 31, this.updateChangeLog), 31, this.updateDescription), 31), 31, this.updateTitle), 31, this.updateUrl), 31, this.newestVersionName);
    }

    public String toString() {
        long j = this.forceUpdateFromVersion;
        long j10 = this.newestVersion;
        String str = this.updateChangeLog;
        String str2 = this.updateDescription;
        int i7 = this.updatePriority;
        String str3 = this.updateTitle;
        String str4 = this.updateUrl;
        String str5 = this.newestVersionName;
        String str6 = this.md5;
        StringBuilder l10 = X.c.l(j, "UpdateDTO(forceUpdateFromVersion=", ", newestVersion=");
        l10.append(j10);
        l10.append(", updateChangeLog=");
        l10.append(str);
        l10.append(", updateDescription=");
        l10.append(str2);
        l10.append(", updatePriority=");
        l10.append(i7);
        o.v(l10, ", updateTitle=", str3, ", updateUrl=", str4);
        o.v(l10, ", newestVersionName=", str5, ", md5=", str6);
        l10.append(")");
        return l10.toString();
    }
}
