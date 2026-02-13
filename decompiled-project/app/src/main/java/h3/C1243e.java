package h3;

import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;
import r3.C1921e;

/* renamed from: h3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1243e {
    public static final C1243e j = new C1243e();

    /* renamed from: a, reason: collision with root package name */
    public final int f17682a;

    /* renamed from: b, reason: collision with root package name */
    public final C1921e f17683b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17684c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17685d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17686e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17687f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17688h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f17689i;

    public C1243e() {
        o.t(1, "requiredNetworkType");
        Eb.x xVar = Eb.x.f3893a;
        this.f17683b = new C1921e(null);
        this.f17682a = 1;
        this.f17684c = false;
        this.f17685d = false;
        this.f17686e = false;
        this.f17687f = false;
        this.g = -1L;
        this.f17688h = -1L;
        this.f17689i = xVar;
    }

    public C1243e(C1243e other) {
        kotlin.jvm.internal.l.e(other, "other");
        this.f17684c = other.f17684c;
        this.f17685d = other.f17685d;
        this.f17683b = other.f17683b;
        this.f17682a = other.f17682a;
        this.f17686e = other.f17686e;
        this.f17687f = other.f17687f;
        this.f17689i = other.f17689i;
        this.g = other.g;
        this.f17688h = other.f17688h;
    }

    public C1243e(C1921e c1921e, int i7, boolean z8, boolean z10, boolean z11, boolean z12, long j10, long j11, LinkedHashSet linkedHashSet) {
        o.t(i7, "requiredNetworkType");
        this.f17683b = c1921e;
        this.f17682a = i7;
        this.f17684c = z8;
        this.f17685d = z10;
        this.f17686e = z11;
        this.f17687f = z12;
        this.g = j10;
        this.f17688h = j11;
        this.f17689i = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1243e.class.equals(obj.getClass())) {
            return false;
        }
        C1243e c1243e = (C1243e) obj;
        if (this.f17684c == c1243e.f17684c && this.f17685d == c1243e.f17685d && this.f17686e == c1243e.f17686e && this.f17687f == c1243e.f17687f && this.g == c1243e.g && this.f17688h == c1243e.f17688h && kotlin.jvm.internal.l.a(this.f17683b.f23664a, c1243e.f17683b.f23664a) && this.f17682a == c1243e.f17682a) {
            return kotlin.jvm.internal.l.a(this.f17689i, c1243e.f17689i);
        }
        return false;
    }

    public final int hashCode() {
        int b2 = ((((((((P.c.b(this.f17682a) * 31) + (this.f17684c ? 1 : 0)) * 31) + (this.f17685d ? 1 : 0)) * 31) + (this.f17686e ? 1 : 0)) * 31) + (this.f17687f ? 1 : 0)) * 31;
        long j10 = this.g;
        int i7 = (b2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f17688h;
        int hashCode = (this.f17689i.hashCode() + ((i7 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequest = this.f17683b.f23664a;
        return hashCode + (networkRequest != null ? networkRequest.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + o.x(this.f17682a) + ", requiresCharging=" + this.f17684c + ", requiresDeviceIdle=" + this.f17685d + ", requiresBatteryNotLow=" + this.f17686e + ", requiresStorageNotLow=" + this.f17687f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.f17688h + ", contentUriTriggers=" + this.f17689i + ", }";
    }
}
