package Ga;

import com.kt.apps.core.tv.model.TVChannel;
import java.util.ArrayList;
import java.util.List;
import t8.C2034c;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4431a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4433c;

    public /* synthetic */ j(int i7, Hc.d dVar) {
        this.f4432b = i7;
        this.f4433c = dVar;
    }

    public /* synthetic */ j(int i7, List list) {
        this.f4433c = list;
        this.f4432b = i7;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        int i7;
        int i10;
        Integer valueOf;
        String j;
        int i11;
        Hc.d dVar;
        Hc.d dVar2;
        List list;
        int i12;
        String j10;
        int i13;
        switch (this.f4431a) {
            case 0:
                return ((TVChannel) ((List) ((Db.j) ((List) this.f4433c).get(this.f4432b)).f3355b).get(((Integer) obj).intValue())).getChannelId();
            default:
                int i14 = this.f4432b;
                Hc.d dVar3 = (Hc.d) this.f4433c;
                T2.a _connection = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection, "_connection");
                T2.c R10 = _connection.R("SELECT * FROM banner_ads LIMIT ?");
                try {
                    R10.f(1, i14);
                    int h10 = P2.j.h(R10, "id");
                    int h11 = P2.j.h(R10, "productId");
                    int h12 = P2.j.h(R10, "title");
                    int h13 = P2.j.h(R10, "description");
                    int h14 = P2.j.h(R10, "price");
                    int h15 = P2.j.h(R10, "productLink");
                    int h16 = P2.j.h(R10, "qrCodeLink");
                    int h17 = P2.j.h(R10, "ctaAction");
                    int h18 = P2.j.h(R10, "ctaUrl");
                    int h19 = P2.j.h(R10, "sale");
                    int h20 = P2.j.h(R10, "salePrice");
                    int h21 = P2.j.h(R10, "imageUrl");
                    int h22 = P2.j.h(R10, "videoUrl");
                    int h23 = P2.j.h(R10, "adsType");
                    Hc.d dVar4 = dVar3;
                    int h24 = P2.j.h(R10, "productImages");
                    int h25 = P2.j.h(R10, "createdAt");
                    int h26 = P2.j.h(R10, "updatedAt");
                    ArrayList arrayList = new ArrayList();
                    while (R10.J()) {
                        String j11 = R10.j(h10);
                        String j12 = R10.j(h11);
                        String j13 = R10.j(h12);
                        String j14 = R10.j(h13);
                        Double valueOf2 = R10.E(h14) ? null : Double.valueOf(R10.s(h14));
                        String j15 = R10.j(h15);
                        String j16 = R10.j(h16);
                        String j17 = R10.j(h17);
                        String j18 = R10.j(h18);
                        if (R10.E(h19)) {
                            i7 = h11;
                            i10 = h12;
                            valueOf = null;
                        } else {
                            i7 = h11;
                            i10 = h12;
                            valueOf = Integer.valueOf((int) R10.x(h19));
                        }
                        Double valueOf3 = R10.E(h20) ? null : Double.valueOf(R10.s(h20));
                        String j19 = R10.E(h21) ? null : R10.j(h21);
                        String j20 = R10.E(h22) ? null : R10.j(h22);
                        String j21 = R10.j(h23);
                        int i15 = h24;
                        if (R10.E(i15)) {
                            i11 = h10;
                            dVar = dVar4;
                            j = null;
                        } else {
                            j = R10.j(i15);
                            i11 = h10;
                            dVar = dVar4;
                        }
                        int i16 = h23;
                        C2034c c2034c = dVar.f4929c;
                        c2034c.getClass();
                        if (j == null) {
                            dVar2 = dVar;
                            i12 = h25;
                            list = null;
                        } else {
                            dVar2 = dVar;
                            list = (List) ((G8.m) c2034c.f24513b).c(j, new Gc.a().f7387b);
                            i12 = h25;
                        }
                        if (R10.E(i12)) {
                            i13 = h26;
                            j10 = null;
                        } else {
                            j10 = R10.j(i12);
                            i13 = h26;
                        }
                        arrayList.add(new Ic.b(j11, j12, j13, j14, valueOf2, j15, j16, j17, j18, valueOf, valueOf3, j19, j20, j21, list, j10, R10.E(i13) ? null : R10.j(i13)));
                        h25 = i12;
                        h26 = i13;
                        h23 = i16;
                        h12 = i10;
                        dVar4 = dVar2;
                        h10 = i11;
                        h24 = i15;
                        h11 = i7;
                    }
                    return arrayList;
                } finally {
                    R10.close();
                }
        }
    }
}
