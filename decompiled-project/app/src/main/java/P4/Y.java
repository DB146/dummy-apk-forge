package P4;

import H2.C0297k;
import N6.t0;
import a5.C0776b;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.kt.apps.core.service.CloudMessagingService;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.blurry.BlurFactor;
import h7.C1256b;
import h7.C1257c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jb.InterfaceC1390a;
import jb.InterfaceC1391b;
import m4.InterfaceC1567f;
import m4.InterfaceC1569g;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements InterfaceC1567f, OnFailureListener, OnCanceledListener, p7.c, InterfaceC1391b, InterfaceC1390a, a3.t, Y3.g, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7974a;

    public /* synthetic */ Y(int i7) {
        this.f7974a = i7;
    }

    @Override // a3.t
    public void a(a3.s sVar, a3.u uVar, boolean z8) {
        switch (this.f7974a) {
            case 19:
                sVar.a(uVar);
                return;
            case 20:
                sVar.d(uVar);
                return;
            case 21:
                sVar.f(uVar);
                return;
            case 22:
                sVar.b();
                return;
            default:
                sVar.c();
                return;
        }
    }

    @Override // jb.InterfaceC1391b
    public Object apply(Object obj, Object obj2) {
        switch (this.f7974a) {
            case 17:
                TVChannelLinkStream left = (TVChannelLinkStream) obj;
                TVChannelLinkStream right = (TVChannelLinkStream) obj2;
                kotlin.jvm.internal.l.e(left, "left");
                kotlin.jvm.internal.l.e(right, "right");
                ArrayList u02 = Eb.o.u0(left.getLinkStream());
                if (!right.getLinkStream().isEmpty()) {
                    u02.addAll(right.getLinkStream());
                }
                return TVChannelLinkStream.copy$default(left, null, Eb.o.s0(new LinkedHashSet(u02)), 1, null);
            default:
                List t1 = (List) obj;
                List t22 = (List) obj2;
                kotlin.jvm.internal.l.e(t1, "t1");
                kotlin.jvm.internal.l.e(t22, "t2");
                ArrayList u03 = Eb.o.u0(t1);
                u03.addAll(t22);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = u03.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    N9.a aVar = (N9.a) next;
                    if (hashSet.add(aVar.f7393e + aVar.f7391c)) {
                        arrayList.add(next);
                    }
                }
                return Eb.o.n0(new C0297k(13), arrayList);
        }
    }

    @Override // Y3.g
    public void b(Exception exc) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006c  */
    @Override // m4.InterfaceC1567f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC1569g c(Bundle bundle) {
        t0 x2;
        Q4.a[] aVarArr;
        int i7;
        float f4;
        String str;
        int i10;
        float f10;
        String str2;
        int i11;
        boolean z8 = true;
        switch (this.f7974a) {
            case 1:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(m0.f8103f);
                if (parcelableArrayList == null) {
                    N6.F f11 = N6.H.f7232b;
                    x2 = t0.f7341e;
                } else {
                    x2 = AbstractC1705a.x(m4.L.f20033D0, parcelableArrayList);
                }
                return new m0(bundle.getString(m0.f8104u, ""), (m4.L[]) x2.toArray(new m4.L[0]));
            case 2:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(n0.f8118e);
                return parcelableArrayList2 == null ? new n0(new m0[0]) : new n0((m0[]) AbstractC1705a.x(m0.f8105v, parcelableArrayList2).toArray(new m0[0]));
            case 3:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(Q4.b.f8640v);
                if (parcelableArrayList3 == null) {
                    aVarArr = new Q4.a[0];
                } else {
                    Q4.a[] aVarArr2 = new Q4.a[parcelableArrayList3.size()];
                    for (int i12 = 0; i12 < parcelableArrayList3.size(); i12++) {
                        aVarArr2[i12] = (Q4.a) Q4.a.f8625E.c((Bundle) parcelableArrayList3.get(i12));
                    }
                    aVarArr = aVarArr2;
                }
                return new Q4.b(aVarArr, bundle.getLong(Q4.b.f8641w, 0L), bundle.getLong(Q4.b.f8642x, -9223372036854775807L), bundle.getInt(Q4.b.f8643y, 0));
            case 4:
                long j = bundle.getLong(Q4.a.f8626w);
                int i13 = bundle.getInt(Q4.a.f8627x);
                int i14 = bundle.getInt(Q4.a.f8624D);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(Q4.a.f8628y);
                int[] intArray = bundle.getIntArray(Q4.a.f8629z);
                long[] longArray = bundle.getLongArray(Q4.a.f8621A);
                long j10 = bundle.getLong(Q4.a.f8622B);
                boolean z10 = bundle.getBoolean(Q4.a.f8623C);
                if (intArray == null) {
                    intArray = new int[0];
                }
                return new Q4.a(j, i13, i14, intArray, parcelableArrayList4 == null ? new Uri[0] : (Uri[]) parcelableArrayList4.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j10, z10);
            default:
                CharSequence charSequence = bundle.getCharSequence(C0776b.f12709G);
                CharSequence charSequence2 = charSequence != null ? charSequence : null;
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C0776b.f12710H);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(C0776b.f12711I);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(C0776b.f12712J);
                Bitmap bitmap2 = bitmap != null ? bitmap : null;
                String str3 = C0776b.f12713K;
                if (bundle.containsKey(str3)) {
                    String str4 = C0776b.L;
                    if (bundle.containsKey(str4)) {
                        f4 = bundle.getFloat(str3);
                        i7 = bundle.getInt(str4);
                        String str5 = C0776b.f12714M;
                        int i15 = !bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                        String str6 = C0776b.f12715N;
                        float f12 = !bundle.containsKey(str6) ? bundle.getFloat(str6) : -3.4028235E38f;
                        String str7 = C0776b.f12716O;
                        int i16 = !bundle.containsKey(str7) ? bundle.getInt(str7) : Integer.MIN_VALUE;
                        str = C0776b.f12718Q;
                        if (bundle.containsKey(str)) {
                            String str8 = C0776b.f12717P;
                            if (bundle.containsKey(str8)) {
                                f10 = bundle.getFloat(str);
                                i10 = bundle.getInt(str8);
                                String str9 = C0776b.f12719R;
                                float f13 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                                String str10 = C0776b.f12720S;
                                float f14 = bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                str2 = C0776b.f12721T;
                                if (bundle.containsKey(str2)) {
                                    i11 = bundle.getInt(str2);
                                } else {
                                    i11 = -16777216;
                                    z8 = false;
                                }
                                boolean z11 = !bundle.getBoolean(C0776b.f12722U, false) ? false : z8;
                                String str11 = C0776b.f12723V;
                                int i17 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                                String str12 = C0776b.f12724W;
                                return new C0776b(charSequence2, alignment2, alignment4, bitmap2, f4, i7, i15, f12, i16, i10, f10, f13, f14, z11, i11, i17, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
                            }
                        }
                        i10 = Integer.MIN_VALUE;
                        f10 = -3.4028235E38f;
                        String str92 = C0776b.f12719R;
                        if (bundle.containsKey(str92)) {
                        }
                        String str102 = C0776b.f12720S;
                        if (bundle.containsKey(str102)) {
                        }
                        str2 = C0776b.f12721T;
                        if (bundle.containsKey(str2)) {
                        }
                        if (!bundle.getBoolean(C0776b.f12722U, false)) {
                        }
                        String str112 = C0776b.f12723V;
                        if (bundle.containsKey(str112)) {
                        }
                        String str122 = C0776b.f12724W;
                        return new C0776b(charSequence2, alignment2, alignment4, bitmap2, f4, i7, i15, f12, i16, i10, f10, f13, f14, z11, i11, i17, bundle.containsKey(str122) ? bundle.getFloat(str122) : 0.0f);
                    }
                }
                i7 = Integer.MIN_VALUE;
                f4 = -3.4028235E38f;
                String str52 = C0776b.f12714M;
                if (!bundle.containsKey(str52)) {
                }
                String str62 = C0776b.f12715N;
                if (!bundle.containsKey(str62)) {
                }
                String str72 = C0776b.f12716O;
                if (!bundle.containsKey(str72)) {
                }
                str = C0776b.f12718Q;
                if (bundle.containsKey(str)) {
                }
                i10 = Integer.MIN_VALUE;
                f10 = -3.4028235E38f;
                String str922 = C0776b.f12719R;
                if (bundle.containsKey(str922)) {
                }
                String str1022 = C0776b.f12720S;
                if (bundle.containsKey(str1022)) {
                }
                str2 = C0776b.f12721T;
                if (bundle.containsKey(str2)) {
                }
                if (!bundle.getBoolean(C0776b.f12722U, false)) {
                }
                String str1122 = C0776b.f12723V;
                if (bundle.containsKey(str1122)) {
                }
                String str1222 = C0776b.f12724W;
                return new C0776b(charSequence2, alignment2, alignment4, bitmap2, f4, i7, i15, f12, i16, i10, f10, f13, f14, z11, i11, i17, bundle.containsKey(str1222) ? bundle.getFloat(str1222) : 0.0f);
        }
    }

    public void d(Object obj) {
        ((a0) obj).f7986b.release();
    }

    @Override // p7.c
    public Object g(T6.a aVar) {
        switch (this.f7974a) {
            case 9:
                return TransportRegistrar.c(aVar);
            case 10:
                return TransportRegistrar.b(aVar);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return TransportRegistrar.a(aVar);
            case 16:
                return FirebaseDynamicLinkRegistrar.a(aVar);
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return AbtRegistrar.a(aVar);
            default:
                return FirestoreRegistrar.a(aVar);
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        int i7 = CloudMessagingService.f16116C;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        int i7 = CloudMessagingService.f16116C;
        kotlin.jvm.internal.l.e(it, "it");
    }

    @Override // jb.InterfaceC1390a
    public void run() {
        Db.o oVar = Z9.F.f12239f;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return task.isSuccessful() ? Tasks.forResult(C1257c.a((C1256b) task.getResult())) : Tasks.forResult(new C1257c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new Y6.k(task.getException().getMessage(), task.getException())));
    }
}
