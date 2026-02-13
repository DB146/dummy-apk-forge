package A1;

import A4.n;
import A4.v;
import A8.C0048l;
import A8.Q;
import A8.S;
import A9.AbstractC0074d;
import A9.C0098j;
import A9.C0109l2;
import A9.C0152w2;
import A9.D1;
import A9.N1;
import B0.C0170c0;
import Da.k;
import Da.m;
import E4.w;
import E4.x;
import Eb.p;
import I8.o;
import I8.t;
import M6.i;
import W1.C0558a;
import W1.G;
import W1.U;
import a1.j;
import ac.AbstractC0796a;
import android.R;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.credentials.playservices.HiddenActivity;
import cc.J;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.kt.apps.core.service.CloudMessagingService;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import g3.C1191j;
import j7.InterfaceC1385a;
import j8.InterfaceC1386a;
import j8.InterfaceC1387b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1390a;
import kotlin.jvm.internal.l;
import m4.C1558a0;
import m4.L;
import o.C1759t;
import o7.InterfaceC1811a;
import r4.q;
import r4.r;
import sb.C2010d;
import tb.C2037a;
import tss.r.core.ads.ui.leanback.ShopeeProductDetailsActivity;
import va.C2161e;
import y1.C2355c;
import y1.C2357e;
import y1.InterfaceC2356d;
import y1.K;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements i, Y3.e, D1, N1, InterfaceC1390a, j, OnSuccessListener, w, r, gb.r, InterfaceC1386a, o, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f330b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f329a = i7;
        this.f330b = obj;
    }

    public /* synthetic */ d(C2161e c2161e, M9.d dVar) {
        this.f329a = 22;
        this.f330b = dVar;
    }

    @Override // a1.j
    public Object a(a1.i iVar) {
        J j = (J) this.f330b;
        j.invokeOnCompletion(new C0170c0(6, iVar, j));
        return "Deferred.asListenableFuture";
    }

    @Override // M6.i, Y3.e
    public Object apply(Object obj) {
        switch (this.f329a) {
            case 1:
                v vVar = (v) obj;
                ((n) this.f330b).getClass();
                return vVar;
            default:
                ((C0048l) this.f330b).getClass();
                String u3 = S.f581b.u((Q) obj);
                l.d(u3, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                Log.d("EventGDTLogger", "Session Event Type: SESSION_START");
                byte[] bytes = u3.getBytes(AbstractC0796a.f12815a);
                l.d(bytes, "getBytes(...)");
                return bytes;
        }
    }

    @Override // A9.InterfaceC0149w
    public void b(C0109l2 c0109l2, Object obj, C0152w2 c0152w2, Object obj2) {
        U j;
        switch (this.f329a) {
            case 4:
                Aa.w wVar = (Aa.w) this.f330b;
                SimpleDateFormat simpleDateFormat = Aa.w.f1546v2;
                if (obj instanceof Jc.a) {
                    int i7 = ShopeeProductDetailsActivity.f24555R;
                    Y6.b.x(wVar.i0(), (Jc.a) obj);
                    return;
                }
                if (obj instanceof TVChannel) {
                    wVar.r1();
                    TVChannel tVChannel = (TVChannel) obj;
                    wVar.q1().markLastWatchedChannel(tVChannel);
                    synchronized (wVar.n1()) {
                        wVar.n1().clear();
                        wVar.n1().put(((TVChannel) obj).getChannelId(), Boolean.TRUE);
                    }
                    wVar.o1(tVChannel);
                    C0098j c0098j = wVar.f27464h1;
                    l.c(c0098j, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
                    c0098j.f1233c.indexOf(obj);
                    return;
                }
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                boolean z8 = obj instanceof Jc.a;
                Ca.i iVar = (Ca.i) this.f330b;
                if (z8) {
                    int i10 = ShopeeProductDetailsActivity.f24555R;
                    Y6.b.x(iVar.i0(), (Jc.a) obj);
                    return;
                }
                if (obj instanceof TVChannel) {
                    TVChannel tVChannel2 = (TVChannel) obj;
                    if (!tVChannel2.isFreeContent()) {
                        ActivityUtilsKt.showErrorDialog$default(iVar, null, "Đây là nội dung tính phí\r\nLiên hệ đội phát triển để có thêm thông tin", null, null, null, false, false, null, null, 509, null);
                        return;
                    }
                    iVar.H0().getListProgramForChannel(tVChannel2);
                    BaseTVChannelViewModel.getLinkStreamForChannel$default(iVar.H0(), tVChannel2, false, 2, null);
                    View view = c0109l2.f1271a;
                    l.c(view, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ImageCardView");
                    return;
                }
                return;
            case 9:
                boolean z10 = obj instanceof Jc.a;
                Ca.r rVar = (Ca.r) this.f330b;
                if (z10) {
                    int i11 = ShopeeProductDetailsActivity.f24555R;
                    Y6.b.x(rVar.i0(), (Jc.a) obj);
                    return;
                } else {
                    if (obj instanceof TVChannel) {
                        TVChannel tVChannel3 = (TVChannel) obj;
                        if (tVChannel3.isFreeContent() || rVar.f10272P || rVar.L()) {
                            BaseTVChannelViewModel.getLinkStreamForChannel$default((ta.c) rVar.f3130F0.getValue(), tVChannel3, false, 2, null);
                            return;
                        } else {
                            ActivityUtilsKt.showErrorDialog$default(rVar, null, "Đây là nội dung tính phí\r\nLiên hệ đội phát triển để có thêm thông tin", null, null, null, false, false, null, null, 509, null);
                            return;
                        }
                    }
                    return;
                }
            case 14:
                m mVar = (m) this.f330b;
                if (obj instanceof TVChannel) {
                    try {
                        G A10 = mVar.A();
                        if (A10 == null || (j = A10.j()) == null) {
                            return;
                        }
                        C0558a c0558a = new C0558a(j);
                        TVChannel tvChannel = (TVChannel) obj;
                        l.e(tvChannel, "tvChannel");
                        k kVar = new k();
                        Bundle e2 = com.bumptech.glide.c.e();
                        e2.putParcelable("extra:key_tv_channel", tvChannel);
                        kVar.l0(e2);
                        c0558a.g(R.id.content, kVar, "FragmentCustomNumber", 1);
                        c0558a.c("FragmentCustomNumber");
                        c0558a.e(true);
                        return;
                    } catch (Throwable th) {
                        com.bumptech.glide.c.n(th);
                        return;
                    }
                }
                return;
            default:
                boolean z11 = obj instanceof AbstractC0074d;
                Mc.f fVar = (Mc.f) this.f330b;
                if (!z11) {
                    if (obj instanceof Jc.a) {
                        int i12 = ShopeeProductDetailsActivity.f24555R;
                        Y6.b.x(fVar.i0(), (Jc.a) obj);
                        return;
                    }
                    return;
                }
                long j10 = ((AbstractC0074d) obj).f1099a;
                if (j10 == 1) {
                    U j11 = fVar.g0().j();
                    j11.getClass();
                    C0558a c0558a2 = new C0558a(j11);
                    Jc.a aVar = fVar.p1;
                    if (aVar == null) {
                        l.j("bannerAd");
                        throw null;
                    }
                    String strToGenerateQrCode = aVar.f5787w;
                    l.e(strToGenerateQrCode, "strToGenerateQrCode");
                    Lc.b bVar = new Lc.b();
                    bVar.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                    c0558a2.g(R.id.content, bVar, null, 1);
                    c0558a2.c(null);
                    c0558a2.e(false);
                    return;
                }
                if (j10 == 2) {
                    U j12 = fVar.g0().j();
                    j12.getClass();
                    C0558a c0558a3 = new C0558a(j12);
                    Jc.a aVar2 = fVar.p1;
                    if (aVar2 == null) {
                        l.j("bannerAd");
                        throw null;
                    }
                    String imageUrl = aVar2.f5785u;
                    l.e(imageUrl, "imageUrl");
                    Lc.b bVar2 = new Lc.b();
                    bVar2.l0(com.bumptech.glide.c.f(new Db.j("extra:image_url", imageUrl), new Db.j("extra:is_image_mode", Boolean.TRUE)));
                    c0558a3.g(R.id.content, bVar2, null, 1);
                    c0558a3.c(null);
                    c0558a3.e(false);
                    return;
                }
                return;
        }
    }

    @Override // gb.r
    public void c(C2037a c2037a) {
        Ec.a aVar = (Ec.a) this.f330b;
        try {
            List a9 = ((Jc.c) aVar.f3897b.b(aVar.f3896a.g("shopee_product_info"), new N8.a(Jc.c.class))).a();
            ArrayList arrayList = new ArrayList(p.S(a9, 10));
            Iterator it = a9.iterator();
            while (it.hasNext()) {
                arrayList.add(((Jc.b) it.next()).a());
            }
            c2037a.c(arrayList);
        } catch (Exception e2) {
            c2037a.a(e2);
        }
    }

    @Override // E4.w
    public int d(Object obj) {
        E4.m mVar = (E4.m) obj;
        mVar.getClass();
        L l10 = (L) this.f330b;
        String str = l10.f20096z;
        String str2 = mVar.f3582b;
        return ((str2.equals(str) || str2.equals(x.b(l10))) && mVar.c(l10, false)) ? 1 : 0;
    }

    @Override // r4.r
    public q e(C1558a0 it) {
        l.e(it, "it");
        return (q) ((kotlin.jvm.internal.v) this.f330b).f19134a;
    }

    @Override // j8.InterfaceC1386a
    public void f(InterfaceC1387b interfaceC1387b) {
        switch (this.f329a) {
            case 18:
                q3.c cVar = (q3.c) this.f330b;
                cVar.getClass();
                ((AtomicReference) cVar.f23372c).set((InterfaceC1385a) interfaceC1387b.get());
                return;
            default:
                q3.e eVar = (q3.e) this.f330b;
                eVar.getClass();
                ((AtomicReference) eVar.f23377c).set((InterfaceC1811a) interfaceC1387b.get());
                return;
        }
    }

    public boolean g(C1191j c1191j, int i7, Bundle bundle) {
        InterfaceC2356d interfaceC2356d;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((h) c1191j.f17441b).r();
                Parcelable parcelable = (Parcelable) ((h) c1191j.f17441b).n();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ClipDescription description = ((h) c1191j.f17441b).getDescription();
        h hVar = (h) c1191j.f17441b;
        ClipData clipData = new ClipData(description, new ClipData.Item(hVar.o()));
        if (i10 >= 31) {
            interfaceC2356d = new C2355c(clipData, 2);
        } else {
            C2357e c2357e = new C2357e();
            c2357e.f26690b = clipData;
            c2357e.f26691c = 2;
            interfaceC2356d = c2357e;
        }
        interfaceC2356d.b(hVar.u());
        interfaceC2356d.a(bundle);
        return K.j((C1759t) this.f330b, interfaceC2356d.build()) == null;
    }

    @Override // I8.o
    public Object h() {
        Object obj = this.f330b;
        switch (this.f329a) {
            case 20:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    com.bumptech.glide.d dVar = L8.c.f6421a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e10) {
                    throw new RuntimeException("Failed to invoke constructor '" + L8.c.b(constructor) + "' with no args", e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to invoke constructor '" + L8.c.b(constructor) + "' with no args", e11.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return t.f5310a.a(cls);
                } catch (Exception e12) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e12);
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        l.e(it, "it");
        C2010d c2010d = (C2010d) this.f330b;
        if (c2010d.g()) {
            return;
        }
        c2010d.onError(it);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Object obj2 = this.f330b;
        switch (this.f329a) {
            case 10:
                int i7 = HiddenActivity.f13314c;
                ((D1.c) obj2).invoke(obj);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                int i10 = HiddenActivity.f13314c;
                ((D1.c) obj2).invoke(obj);
                return;
            case 12:
                int i11 = HiddenActivity.f13314c;
                ((D1.c) obj2).invoke(obj);
                return;
            case 13:
                int i12 = HiddenActivity.f13314c;
                ((D1.c) obj2).invoke(obj);
                return;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                ((Aa.t) obj2).invoke(obj);
                return;
            default:
                int i13 = CloudMessagingService.f16116C;
                ((Ba.i) obj2).invoke(obj);
                return;
        }
    }

    @Override // jb.InterfaceC1390a
    public void run() {
        switch (this.f329a) {
            case 5:
                Ba.h hVar = (Ba.h) this.f330b;
                ((Ba.g) hVar.k.getValue()).removeCallbacks(hVar.a());
                return;
            case 22:
                String message = "addIPTVSource Success: " + ((M9.d) this.f330b);
                l.e(message, "message");
                return;
            case 23:
                ((C2161e) this.f330b).c(true);
                return;
            default:
                M9.k t5 = (M9.k) this.f330b;
                l.e(t5, "t");
                return;
        }
    }
}
