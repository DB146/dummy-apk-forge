package m4;

import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final /* synthetic */ class G0 implements InterfaceC1567f, n5.i, n5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19907a;

    public /* synthetic */ G0(int i7) {
        this.f19907a = i7;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.io.Serializable] */
    @Override // m4.InterfaceC1567f
    public InterfaceC1569g c(Bundle bundle) {
        switch (this.f19907a) {
            case 0:
                AbstractC1705a.h(bundle.getInt(C0.f19878a, -1) == 3);
                return bundle.getBoolean(H0.f19911e, false) ? new H0(bundle.getBoolean(H0.f19912f, false)) : new H0();
            case 1:
                int i7 = bundle.getInt(J0.f19958v, 0);
                long j = bundle.getLong(J0.f19959w, -9223372036854775807L);
                long j10 = bundle.getLong(J0.f19960x, 0L);
                boolean z8 = bundle.getBoolean(J0.f19961y, false);
                Bundle bundle2 = bundle.getBundle(J0.f19962z);
                Q4.b bVar = bundle2 != null ? (Q4.b) Q4.b.f8644z.c(bundle2) : Q4.b.f8638f;
                J0 j02 = new J0();
                j02.i(null, null, i7, j, j10, bVar, z8);
                return j02;
            case 2:
                Bundle bundle3 = bundle.getBundle(K0.f20002I);
                C1558a0 c1558a0 = bundle3 != null ? (C1558a0) C1558a0.f20216B.c(bundle3) : C1558a0.f20217u;
                long j11 = bundle.getLong(K0.f20003J, -9223372036854775807L);
                long j12 = bundle.getLong(K0.f20004K, -9223372036854775807L);
                long j13 = bundle.getLong(K0.L, -9223372036854775807L);
                boolean z10 = bundle.getBoolean(K0.f20005M, false);
                boolean z11 = bundle.getBoolean(K0.f20006N, false);
                Bundle bundle4 = bundle.getBundle(K0.f20007O);
                U u3 = bundle4 != null ? (U) U.f20163z.c(bundle4) : null;
                boolean z12 = bundle.getBoolean(K0.f20008P, false);
                long j14 = bundle.getLong(K0.f20009Q, 0L);
                long j15 = bundle.getLong(K0.f20010R, -9223372036854775807L);
                int i10 = bundle.getInt(K0.f20011S, 0);
                int i11 = bundle.getInt(K0.f20012T, 0);
                long j16 = bundle.getLong(K0.f20013U, 0L);
                K0 k02 = new K0();
                k02.b(K0.f20000G, c1558a0, null, j11, j12, j13, z10, z11, u3, j14, j15, i10, i11, j16);
                k02.f20030z = z12;
                return k02;
            default:
                P4.Y y10 = P4.m0.f8105v;
                Bundle bundle5 = bundle.getBundle(M0.f20103f);
                bundle5.getClass();
                P4.m0 m0Var = (P4.m0) y10.c(bundle5);
                int[] intArray = bundle.getIntArray(M0.f20104u);
                int i12 = m0Var.f8106a;
                return new M0(m0Var, bundle.getBoolean(M0.f20106w, false), (int[]) E6.b.k(intArray, new int[i12]), (boolean[]) E6.b.k(bundle.getBooleanArray(M0.f20105v), new boolean[i12]));
        }
    }

    @Override // n5.j
    public void d(Object obj, n5.f fVar) {
    }

    @Override // n5.i
    public void invoke(Object obj) {
        n4.j jVar = (n4.j) obj;
        switch (this.f19907a) {
            case 4:
                jVar.getClass();
                return;
            case 5:
                jVar.getClass();
                return;
            case 6:
                jVar.getClass();
                return;
            case 7:
                jVar.getClass();
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                jVar.getClass();
                return;
            case 9:
                jVar.getClass();
                return;
            case 10:
                jVar.getClass();
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                jVar.getClass();
                return;
            case 12:
                jVar.getClass();
                return;
            case 13:
                jVar.getClass();
                return;
            case 14:
                jVar.getClass();
                return;
            case 15:
                jVar.getClass();
                return;
            case 16:
                jVar.getClass();
                return;
            case 17:
                jVar.getClass();
                return;
            case 18:
                jVar.getClass();
                return;
            case 19:
                jVar.getClass();
                return;
            case 20:
            default:
                jVar.getClass();
                return;
            case 21:
                jVar.getClass();
                return;
            case 22:
                jVar.getClass();
                return;
            case 23:
                jVar.getClass();
                return;
            case 24:
                jVar.getClass();
                return;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                jVar.getClass();
                return;
            case 26:
                jVar.getClass();
                return;
            case 27:
                jVar.getClass();
                return;
            case 28:
                jVar.getClass();
                return;
        }
    }
}
