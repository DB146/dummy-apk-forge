package Y5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.MediaDrmException;
import c6.AbstractC0911a;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzql;
import i2.C1331s;
import j0.AbstractC1362A;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jb.InterfaceC1390a;
import lc.InterfaceC1517a;
import o2.InterfaceC1780b;
import q4.InterfaceC1888a;
import s4.C1981i;
import s4.InterfaceC1984l;
import y6.C2395a;
import y6.C2404j;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements InterfaceC0650t, j0.D, InterfaceC1780b, InterfaceC1390a, InterfaceC1517a, r4.y, InterfaceC1984l, y1.r {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ A f11192b = new A(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ A f11193c = new A(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ A f11194d = new A(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ A f11195e = new A(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ A f11196f = new A(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ A f11197u = new A(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ A f11198v = new A(6);

    /* renamed from: w, reason: collision with root package name */
    public static A f11199w;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11200a;

    public A() {
        this.f11200a = 10;
        new C1331s(1);
        new C1331s(0);
    }

    public /* synthetic */ A(int i7) {
        this.f11200a = i7;
    }

    public A(cc.w0 w0Var) {
        this.f11200a = 14;
    }

    public static A s(Context context, int i7) {
        if (!(i7 != 0)) {
            throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC0911a.f14414p);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        Tb.a.n(context, obtainStyledAttributes, 4);
        Tb.a.n(context, obtainStyledAttributes, 9);
        Tb.a.n(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C2404j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C2395a(0)).c();
        obtainStyledAttributes.recycle();
        A a9 = new A(9);
        E6.b.e(rect.left);
        E6.b.e(rect.top);
        E6.b.e(rect.right);
        E6.b.e(rect.bottom);
        return a9;
    }

    @Override // y1.r
    public void a(int i7, int i10, int i11, boolean z8) {
    }

    @Override // r4.y
    public void b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // r4.y
    public Map c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // j0.D
    public AbstractC1362A d(long j, V0.l lVar, V0.c cVar) {
        return new j0.w(android.support.v4.media.session.b.b(0L, j));
    }

    @Override // r4.y
    public void e(byte[] bArr) {
    }

    @Override // s4.InterfaceC1984l
    public void f() {
    }

    @Override // r4.y
    public void g(o7.o oVar) {
    }

    @Override // s4.InterfaceC1984l
    public void i(s4.s sVar) {
    }

    @Override // r4.y
    public byte[] j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // r4.y
    public r4.x k() {
        throw new IllegalStateException();
    }

    @Override // r4.y
    public void l(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // r4.y
    public r4.w m(byte[] bArr, List list, int i7, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // r4.y
    public int n() {
        return 1;
    }

    @Override // r4.y
    public InterfaceC1888a o(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // y1.r
    public void p(int i7, int i10, int i11, int i12) {
    }

    @Override // r4.y
    public boolean q(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // r4.y
    public byte[] r() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // r4.y
    public void release() {
    }

    @Override // jb.InterfaceC1390a
    public void run() {
    }

    public String toString() {
        switch (this.f11200a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return "RectangleShape";
            case 12:
            default:
                return super.toString();
            case 13:
                return "EmptyAction";
        }
    }

    @Override // s4.InterfaceC1984l
    public s4.v u(int i7, int i10) {
        return new C1981i();
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f11200a) {
            case 0:
                List list = F.f11304a;
                return zzoy.zzab();
            case 1:
                List list2 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzv());
            case 2:
                List list3 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzai());
            case 3:
                List list4 = F.f11304a;
                return Boolean.valueOf(zzpn.zzb());
            case 4:
                List list5 = F.f11304a;
                return Boolean.valueOf(zzql.zzb());
            case 5:
                List list6 = F.f11304a;
                return Boolean.valueOf(zzph.zza());
            default:
                return new Boolean(zzpz.zza());
        }
    }
}
