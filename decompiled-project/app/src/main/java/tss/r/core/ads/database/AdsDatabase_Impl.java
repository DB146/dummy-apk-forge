package tss.r.core.ads.database;

import A9.C0163z1;
import Db.o;
import Eb.v;
import H2.E;
import Hc.d;
import I2.C0323l;
import Rb.a;
import android.support.v4.media.session.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.w;
import tss.r.core.ads.database.AdsDatabase_Impl;

/* loaded from: classes2.dex */
public final class AdsDatabase_Impl extends AdsDatabase {

    /* renamed from: n, reason: collision with root package name */
    public final o f24543n;

    /* renamed from: o, reason: collision with root package name */
    public final o f24544o;

    public AdsDatabase_Impl() {
        b.z(new C0163z1(this));
        final int i7 = 0;
        this.f24543n = b.z(new a(this) { // from class: Fc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdsDatabase_Impl f4218b;

            {
                this.f4218b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return new d(this.f4218b);
                    default:
                        return new Hc.b(this.f4218b);
                }
            }
        });
        final int i10 = 1;
        this.f24544o = b.z(new a(this) { // from class: Fc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdsDatabase_Impl f4218b;

            {
                this.f4218b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new d(this.f4218b);
                    default:
                        return new Hc.b(this.f4218b);
                }
            }
        });
    }

    @Override // I2.E
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // I2.E
    public final C0323l e() {
        return new C0323l(this, new LinkedHashMap(), new LinkedHashMap(), "video_ads", "banner_ads", "ads_version");
    }

    @Override // I2.E
    public final E f() {
        return new Fc.b(this);
    }

    @Override // I2.E
    public final Set l() {
        return new LinkedHashSet();
    }

    @Override // I2.E
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e a9 = w.a(Hc.e.class);
        v vVar = v.f3891a;
        linkedHashMap.put(a9, vVar);
        linkedHashMap.put(w.a(d.class), vVar);
        linkedHashMap.put(w.a(Hc.b.class), vVar);
        return linkedHashMap;
    }

    @Override // tss.r.core.ads.database.AdsDatabase
    public final Hc.b x() {
        return (Hc.b) this.f24544o.getValue();
    }

    @Override // tss.r.core.ads.database.AdsDatabase
    public final d y() {
        return (d) this.f24543n.getValue();
    }
}
