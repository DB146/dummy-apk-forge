package V4;

import N6.F;
import N6.H;
import N6.t0;
import java.util.List;
import r4.C1936h;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: A, reason: collision with root package name */
    public final H f10064A;

    /* renamed from: z, reason: collision with root package name */
    public final String f10065z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str, long j, long j10, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j10, false, t0.f7341e);
        F f4 = H.f7232b;
    }

    public f(String str, f fVar, String str2, long j, int i7, long j10, C1936h c1936h, String str3, String str4, long j11, long j12, boolean z8, List list) {
        super(str, fVar, j, i7, j10, c1936h, str3, str4, j11, j12, z8);
        this.f10065z = str2;
        this.f10064A = H.F(list);
    }
}
