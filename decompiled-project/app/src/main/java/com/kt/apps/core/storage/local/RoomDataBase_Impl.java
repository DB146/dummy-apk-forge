package com.kt.apps.core.storage.local;

import Db.o;
import Eb.v;
import H2.E;
import I2.C0323l;
import Rb.a;
import U9.d;
import U9.h;
import U9.i;
import U9.j;
import U9.l;
import U9.m;
import U9.n;
import U9.p;
import U9.q;
import U9.s;
import U9.t;
import U9.u;
import U9.w;
import android.support.v4.media.session.b;
import com.kt.apps.core.storage.local.RoomDataBase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e;

/* loaded from: classes2.dex */
public final class RoomDataBase_Impl extends RoomDataBase {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f16138K = 0;

    /* renamed from: A, reason: collision with root package name */
    public final o f16139A;

    /* renamed from: B, reason: collision with root package name */
    public final o f16140B;

    /* renamed from: C, reason: collision with root package name */
    public final o f16141C;

    /* renamed from: D, reason: collision with root package name */
    public final o f16142D;

    /* renamed from: E, reason: collision with root package name */
    public final o f16143E;

    /* renamed from: F, reason: collision with root package name */
    public final o f16144F;

    /* renamed from: G, reason: collision with root package name */
    public final o f16145G;

    /* renamed from: H, reason: collision with root package name */
    public final o f16146H;

    /* renamed from: I, reason: collision with root package name */
    public final o f16147I;

    /* renamed from: J, reason: collision with root package name */
    public final o f16148J;

    /* renamed from: z, reason: collision with root package name */
    public final o f16149z;

    public RoomDataBase_Impl() {
        final int i7 = 0;
        this.f16149z = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i7) {
                    case 0:
                        int i10 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i11 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i12 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i13 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i14 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i15 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i16 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i17 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i18 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        final int i10 = 7;
        this.f16139A = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i10) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i11 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i12 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i13 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i14 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i15 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i16 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i17 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i18 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        b.z(new S9.a(this, i10));
        final int i11 = 8;
        b.z(new S9.a(this, i11));
        this.f16140B = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i11) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i112 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i12 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i13 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i14 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i15 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i16 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i17 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i18 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        final int i12 = 9;
        this.f16141C = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i12) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i112 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i122 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i13 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i14 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i15 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i16 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i17 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i18 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        final int i13 = 10;
        this.f16142D = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i13) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i112 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i122 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i132 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i14 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i15 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i16 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i17 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i18 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        final int i14 = 1;
        this.f16143E = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i14) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i112 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i122 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i132 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i142 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i15 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i16 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i17 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i18 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        final int i15 = 2;
        this.f16144F = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i15) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i112 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i122 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i132 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i142 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i152 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i16 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i17 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i18 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        final int i16 = 3;
        this.f16145G = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i16) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i112 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i122 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i132 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i142 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i152 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i162 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i17 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i18 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        final int i17 = 4;
        this.f16146H = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i17) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i112 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i122 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i132 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i142 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i152 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i162 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i172 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i18 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        final int i18 = 5;
        this.f16147I = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i18) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i112 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i122 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i132 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i142 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i152 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i162 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i172 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i182 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i19 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
        final int i19 = 6;
        this.f16148J = b.z(new a(this) { // from class: S9.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoomDataBase_Impl f9192b;

            {
                this.f9192b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                RoomDataBase_Impl roomDataBase_Impl = this.f9192b;
                switch (i19) {
                    case 0:
                        int i102 = RoomDataBase_Impl.f16138K;
                        return new U9.m(roomDataBase_Impl);
                    case 1:
                        int i112 = RoomDataBase_Impl.f16138K;
                        return new U9.d(roomDataBase_Impl);
                    case 2:
                        int i122 = RoomDataBase_Impl.f16138K;
                        return new U9.a(roomDataBase_Impl);
                    case 3:
                        int i132 = RoomDataBase_Impl.f16138K;
                        return new t(roomDataBase_Impl);
                    case 4:
                        int i142 = RoomDataBase_Impl.f16138K;
                        return new u(roomDataBase_Impl);
                    case 5:
                        int i152 = RoomDataBase_Impl.f16138K;
                        return new U9.l(roomDataBase_Impl);
                    case 6:
                        int i162 = RoomDataBase_Impl.f16138K;
                        return new w(roomDataBase_Impl);
                    case 7:
                        int i172 = RoomDataBase_Impl.f16138K;
                        return new p(roomDataBase_Impl);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        int i182 = RoomDataBase_Impl.f16138K;
                        return new U9.h(roomDataBase_Impl);
                    case 9:
                        int i192 = RoomDataBase_Impl.f16138K;
                        return new U9.o(roomDataBase_Impl);
                    default:
                        int i20 = RoomDataBase_Impl.f16138K;
                        return new s(roomDataBase_Impl);
                }
            }
        });
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final t A() {
        return (t) this.f16145G.getValue();
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final l B() {
        return (l) this.f16147I.getValue();
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final m C() {
        return (m) this.f16149z.getValue();
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final n D() {
        return (n) this.f16141C.getValue();
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final p E() {
        return (p) this.f16139A.getValue();
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final q F() {
        return (q) this.f16142D.getValue();
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final u G() {
        return (u) this.f16146H.getValue();
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final w H() {
        return (w) this.f16148J.getValue();
    }

    @Override // I2.E
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // I2.E
    public final C0323l e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ExtensionsChannelFts4", "ExtensionsChannel");
        linkedHashMap.put("TVChannelFts4", "TVChannelDTO");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("ExtensionsChannel");
        linkedHashMap2.put("extensionchanneldatabaseviews", linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add("ExtensionChannelCategory");
        linkedHashSet2.add("ExtensionsChannel");
        linkedHashMap2.put("extensionschanneldbwithcategoryviews", linkedHashSet2);
        return new C0323l(this, linkedHashMap, linkedHashMap2, "MapChannel", "TVChannelEntity", "FootballMatchEntity", "FootballTeamEntity", "ExtensionsConfig", "TVChannelDTO", "TVChannelUrl", "ExtensionsChannel", "ExtensionChannelCategory", "Programme", "TVScheduler", "ExtensionsChannelFts4", "HistoryMediaItemDTO", "TVChannelFts4", "VideoFavoriteDTO");
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
        e a9 = kotlin.jvm.internal.w.a(m.class);
        v vVar = v.f3891a;
        linkedHashMap.put(a9, vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(p.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(j.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(i.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(h.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(n.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(q.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(d.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(U9.a.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(t.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(u.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(l.class), vVar);
        linkedHashMap.put(kotlin.jvm.internal.w.a(w.class), vVar);
        return linkedHashMap;
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final U9.a x() {
        return (U9.a) this.f16144F.getValue();
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final d y() {
        return (d) this.f16143E.getValue();
    }

    @Override // com.kt.apps.core.storage.local.RoomDataBase
    public final h z() {
        return (h) this.f16140B.getValue();
    }
}
