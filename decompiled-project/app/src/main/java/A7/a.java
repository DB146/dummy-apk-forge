package A7;

import A3.e;
import A3.l;
import C3.A;
import E4.v;
import H2.O;
import J3.B;
import P.c;
import P4.c0;
import P4.d0;
import W4.r;
import W4.s;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ha.g;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import s4.C1979g;
import z1.o;

/* loaded from: classes.dex */
public final class a implements v, O3.a, d0, o {

    /* renamed from: a, reason: collision with root package name */
    public int f531a;

    /* renamed from: b, reason: collision with root package name */
    public Object f532b;

    public a(int i7, O o10) {
        this.f531a = i7;
        this.f532b = new O[]{o10};
    }

    public /* synthetic */ a(int i7, Serializable serializable) {
        this.f531a = i7;
        this.f532b = serializable;
    }

    public a(int i7, boolean z8) {
        switch (i7) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                this.f532b = new n5.v(8);
                return;
            default:
                this.f532b = Bitmap.CompressFormat.JPEG;
                this.f531a = 100;
                return;
        }
    }

    public a(Drawable drawable) {
        this.f531a = 255;
        this.f532b = drawable;
    }

    public /* synthetic */ a(Object obj, int i7) {
        this.f532b = obj;
        this.f531a = i7;
    }

    @Override // O3.a
    public A B(A a9, l lVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) a9.get()).compress((Bitmap.CompressFormat) this.f532b, this.f531a, byteArrayOutputStream);
        a9.d();
        return new B(byteArrayOutputStream.toByteArray());
    }

    @Override // P4.d0
    public void a() {
        e eVar = ((s) this.f532b).f10780z;
        if (eVar != null) {
            throw eVar;
        }
    }

    @Override // P4.d0
    public boolean b() {
        s sVar = (s) this.f532b;
        if (!sVar.f10763E) {
            r rVar = (r) sVar.f10773e.get(this.f531a);
            if (rVar.f10755c.t(rVar.f10756d)) {
                return true;
            }
        }
        return false;
    }

    @Override // E4.v
    public MediaCodecInfo c(int i7) {
        if (((MediaCodecInfo[]) this.f532b) == null) {
            this.f532b = new MediaCodecList(this.f531a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f532b)[i7];
    }

    @Override // z1.o
    public boolean d(View view) {
        ((BottomSheetBehavior) this.f532b).I(this.f531a);
        return true;
    }

    @Override // E4.v
    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // P4.d0
    public int f(g gVar, q4.g gVar2, int i7) {
        s sVar = (s) this.f532b;
        if (sVar.f10763E) {
            return -3;
        }
        r rVar = (r) sVar.f10773e.get(this.f531a);
        return rVar.f10755c.y(gVar, gVar2, i7, rVar.f10756d);
    }

    @Override // E4.v
    public int g() {
        if (((MediaCodecInfo[]) this.f532b) == null) {
            this.f532b = new MediaCodecList(this.f531a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f532b).length;
    }

    @Override // P4.d0
    public int h(long j) {
        s sVar = (s) this.f532b;
        if (sVar.f10763E) {
            return -3;
        }
        r rVar = (r) sVar.f10773e.get(this.f531a);
        c0 c0Var = rVar.f10755c;
        int q10 = c0Var.q(j, rVar.f10756d);
        c0Var.C(q10);
        return q10;
    }

    @Override // E4.v
    public boolean i(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // E4.v
    public boolean j() {
        return true;
    }

    public void k(int i7, String str, String str2) {
        if (c.b(i7) >= c.b(this.f531a)) {
            HashSet hashSet = (HashSet) this.f532b;
            if (hashSet == null || c.b(i7) > 0 || hashSet.contains(str)) {
                int b2 = c.b(i7);
                if (b2 == 0) {
                    Log.d(str, str2);
                    return;
                }
                if (b2 == 1) {
                    Log.i(str, str2);
                } else if (b2 == 2) {
                    Log.w(str, str2);
                } else {
                    if (b2 != 3) {
                        throw new RuntimeException("Should not reach here!");
                    }
                    Log.e(str, str2);
                }
            }
        }
    }

    public long l(C1979g c1979g) {
        n5.v vVar = (n5.v) this.f532b;
        int i7 = 0;
        c1979g.x(vVar.f21229a, 0, 1, false);
        int i10 = vVar.f21229a[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        c1979g.x(vVar.f21229a, 1, i12, false);
        while (i7 < i12) {
            i7++;
            i13 = (vVar.f21229a[i7] & 255) + (i13 << 8);
        }
        this.f531a = i12 + 1 + this.f531a;
        return i13;
    }
}
