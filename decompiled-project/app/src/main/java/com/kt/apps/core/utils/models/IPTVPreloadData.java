package com.kt.apps.core.utils.models;

import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class IPTVPreloadData {
    private final String sourceName;
    private final String sourceUrl;

    public IPTVPreloadData(String sourceName, String sourceUrl) {
        l.e(sourceName, "sourceName");
        l.e(sourceUrl, "sourceUrl");
        this.sourceName = sourceName;
        this.sourceUrl = sourceUrl;
    }

    public static /* synthetic */ IPTVPreloadData copy$default(IPTVPreloadData iPTVPreloadData, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = iPTVPreloadData.sourceName;
        }
        if ((i7 & 2) != 0) {
            str2 = iPTVPreloadData.sourceUrl;
        }
        return iPTVPreloadData.copy(str, str2);
    }

    public final String component1() {
        return this.sourceName;
    }

    public final String component2() {
        return this.sourceUrl;
    }

    public final IPTVPreloadData copy(String sourceName, String sourceUrl) {
        l.e(sourceName, "sourceName");
        l.e(sourceUrl, "sourceUrl");
        return new IPTVPreloadData(sourceName, sourceUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IPTVPreloadData)) {
            return false;
        }
        IPTVPreloadData iPTVPreloadData = (IPTVPreloadData) obj;
        return l.a(this.sourceName, iPTVPreloadData.sourceName) && l.a(this.sourceUrl, iPTVPreloadData.sourceUrl);
    }

    public final String getSourceName() {
        return this.sourceName;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public int hashCode() {
        return this.sourceUrl.hashCode() + (this.sourceName.hashCode() * 31);
    }

    public String toString() {
        return o.n("IPTVPreloadData(sourceName=", this.sourceName, ", sourceUrl=", this.sourceUrl, ")");
    }
}
