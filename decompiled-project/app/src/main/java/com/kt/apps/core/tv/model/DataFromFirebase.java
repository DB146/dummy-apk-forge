package com.kt.apps.core.tv.model;

import A3.c;
import h3.o;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class DataFromFirebase {
    private String logo;
    private String name;
    private String url;

    public DataFromFirebase() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataFromFirebase(String logo) {
        this(logo, null, null, 6, null);
        l.e(logo, "logo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataFromFirebase(String logo, String url) {
        this(logo, url, null, 4, null);
        l.e(logo, "logo");
        l.e(url, "url");
    }

    public DataFromFirebase(String logo, String url, String name) {
        l.e(logo, "logo");
        l.e(url, "url");
        l.e(name, "name");
        this.logo = logo;
        this.url = url;
        this.name = name;
    }

    public /* synthetic */ DataFromFirebase(String str, String str2, String str3, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3);
    }

    public static /* synthetic */ DataFromFirebase copy$default(DataFromFirebase dataFromFirebase, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = dataFromFirebase.logo;
        }
        if ((i7 & 2) != 0) {
            str2 = dataFromFirebase.url;
        }
        if ((i7 & 4) != 0) {
            str3 = dataFromFirebase.name;
        }
        return dataFromFirebase.copy(str, str2, str3);
    }

    public final String component1() {
        return this.logo;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final DataFromFirebase copy(String logo, String url, String name) {
        l.e(logo, "logo");
        l.e(url, "url");
        l.e(name, "name");
        return new DataFromFirebase(logo, url, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataFromFirebase)) {
            return false;
        }
        DataFromFirebase dataFromFirebase = (DataFromFirebase) obj;
        return l.a(this.logo, dataFromFirebase.logo) && l.a(this.url, dataFromFirebase.url) && l.a(this.name, dataFromFirebase.name);
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.name.hashCode() + c.d(this.logo.hashCode() * 31, 31, this.url);
    }

    public final void setLogo(String str) {
        l.e(str, "<set-?>");
        this.logo = str;
    }

    public final void setName(String str) {
        l.e(str, "<set-?>");
        this.name = str;
    }

    public final void setUrl(String str) {
        l.e(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        String str = this.logo;
        String str2 = this.url;
        return o.p(c.o("DataFromFirebase(logo=", str, ", url=", str2, ", name="), this.name, ")");
    }
}
