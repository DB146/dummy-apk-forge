package Qa;

import W1.C;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import i2.C1332t;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import y7.u0;

/* loaded from: classes2.dex */
public final class b extends d<Ma.b> {

    /* renamed from: P0, reason: collision with root package name */
    public static final C1332t f8710P0 = new C1332t(13);

    /* renamed from: K0, reason: collision with root package name */
    public Pa.d f8711K0;

    /* renamed from: L0, reason: collision with root package name */
    public La.g f8712L0;

    /* renamed from: M0, reason: collision with root package name */
    public O9.a f8713M0;

    /* renamed from: N0, reason: collision with root package name */
    public Intent f8714N0;

    /* renamed from: O0, reason: collision with root package name */
    public final int f8715O0 = R.layout.fragment_gg_voice_selector;

    @Override // Qa.d, W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public final void R(Context context) {
        l.e(context, "context");
        C c10 = this;
        do {
            c10 = c10.f10268K;
        } while (c10 != null);
        A().getApplication();
        throw new IllegalArgumentException(X.c.t("No injector was found for ", b.class.getCanonicalName()));
    }

    @Override // y9.AbstractC2463f, W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public final void b0() {
        super.b0();
        w0().I(3);
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u
    public final int p0() {
        return R.style.BottomSheetDialog;
    }

    @Override // y9.AbstractC2463f
    public final int x0() {
        return this.f8715O0;
    }

    @Override // y9.AbstractC2463f
    public final void y0() {
        final int i7 = 1;
        final int i10 = 0;
        final int i11 = 2;
        r0();
        Object obj = h0().get("extra:voice_intent");
        this.f8714N0 = obj instanceof Intent ? (Intent) obj : null;
        if (this.f8711K0 == null) {
            l.j("voicePackage");
            throw null;
        }
        Ma.b bVar = (Ma.b) v0();
        if (this.f8711K0 == null) {
            l.j("voicePackage");
            throw null;
        }
        bVar.f6926G.setTitle("");
        Ma.b bVar2 = (Ma.b) v0();
        if (this.f8711K0 == null) {
            l.j("voicePackage");
            throw null;
        }
        bVar2.f6926G.setDescriptionValue("");
        if (this.f8714N0 != null) {
            ((Ma.b) v0()).f6924E.setText(F().getString(R.string.use));
        }
        Iterator it = u0.f(((Ma.b) v0()).f6926G, ((Ma.b) v0()).f6924E).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: Qa.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f8709b;

                {
                    this.f8709b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            b bVar3 = this.f8709b;
                            if (bVar3.f8714N0 != null) {
                                bVar3.u0();
                                try {
                                    La.g gVar = bVar3.f8712L0;
                                    if (gVar == null) {
                                        l.j("voiceSelectorManager");
                                        throw null;
                                    }
                                    Intent intent = bVar3.f8714N0;
                                    l.b(intent);
                                    gVar.b(intent);
                                    return;
                                } catch (Throwable unused) {
                                    ActivityUtilsKt.showErrorDialog$default(bVar3.g0(), null, "Đã xảy ra lỗi vui lòng thử lại sau", null, null, null, false, false, false, null, null, 1021, null);
                                    return;
                                }
                            }
                            O9.a aVar = bVar3.f8713M0;
                            if (aVar == null) {
                                l.j("logger");
                                throw null;
                            }
                            c2.i.v(aVar, Oa.c.f7534c);
                            La.g gVar2 = bVar3.f8712L0;
                            if (gVar2 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            gVar2.c();
                            bVar3.u0();
                            return;
                        case 1:
                            b bVar4 = this.f8709b;
                            O9.a aVar2 = bVar4.f8713M0;
                            if (aVar2 == null) {
                                l.j("logger");
                                throw null;
                            }
                            c2.i.v(aVar2, Oa.b.f7533c);
                            La.g gVar3 = bVar4.f8712L0;
                            if (gVar3 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            gVar3.f();
                            bVar4.u0();
                            return;
                        default:
                            b bVar5 = this.f8709b;
                            O9.a aVar3 = bVar5.f8713M0;
                            if (aVar3 == null) {
                                l.j("logger");
                                throw null;
                            }
                            c2.i.v(aVar3, Oa.a.f7532c);
                            La.g gVar4 = bVar5.f8712L0;
                            if (gVar4 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            SharedPreferences.Editor edit = gVar4.f6440d.edit();
                            edit.putBoolean("key:GG_ALWAYS", true);
                            edit.commit();
                            La.g gVar5 = bVar5.f8712L0;
                            if (gVar5 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            gVar5.f();
                            bVar5.u0();
                            return;
                    }
                }
            });
        }
        Iterator it2 = u0.f(((Ma.b) v0()).f6923D, ((Ma.b) v0()).f6925F).iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setOnClickListener(new View.OnClickListener(this) { // from class: Qa.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f8709b;

                {
                    this.f8709b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            b bVar3 = this.f8709b;
                            if (bVar3.f8714N0 != null) {
                                bVar3.u0();
                                try {
                                    La.g gVar = bVar3.f8712L0;
                                    if (gVar == null) {
                                        l.j("voiceSelectorManager");
                                        throw null;
                                    }
                                    Intent intent = bVar3.f8714N0;
                                    l.b(intent);
                                    gVar.b(intent);
                                    return;
                                } catch (Throwable unused) {
                                    ActivityUtilsKt.showErrorDialog$default(bVar3.g0(), null, "Đã xảy ra lỗi vui lòng thử lại sau", null, null, null, false, false, false, null, null, 1021, null);
                                    return;
                                }
                            }
                            O9.a aVar = bVar3.f8713M0;
                            if (aVar == null) {
                                l.j("logger");
                                throw null;
                            }
                            c2.i.v(aVar, Oa.c.f7534c);
                            La.g gVar2 = bVar3.f8712L0;
                            if (gVar2 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            gVar2.c();
                            bVar3.u0();
                            return;
                        case 1:
                            b bVar4 = this.f8709b;
                            O9.a aVar2 = bVar4.f8713M0;
                            if (aVar2 == null) {
                                l.j("logger");
                                throw null;
                            }
                            c2.i.v(aVar2, Oa.b.f7533c);
                            La.g gVar3 = bVar4.f8712L0;
                            if (gVar3 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            gVar3.f();
                            bVar4.u0();
                            return;
                        default:
                            b bVar5 = this.f8709b;
                            O9.a aVar3 = bVar5.f8713M0;
                            if (aVar3 == null) {
                                l.j("logger");
                                throw null;
                            }
                            c2.i.v(aVar3, Oa.a.f7532c);
                            La.g gVar4 = bVar5.f8712L0;
                            if (gVar4 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            SharedPreferences.Editor edit = gVar4.f6440d.edit();
                            edit.putBoolean("key:GG_ALWAYS", true);
                            edit.commit();
                            La.g gVar5 = bVar5.f8712L0;
                            if (gVar5 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            gVar5.f();
                            bVar5.u0();
                            return;
                    }
                }
            });
        }
        ((Ma.b) v0()).f6922C.setOnClickListener(new View.OnClickListener(this) { // from class: Qa.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f8709b;

            {
                this.f8709b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        b bVar3 = this.f8709b;
                        if (bVar3.f8714N0 != null) {
                            bVar3.u0();
                            try {
                                La.g gVar = bVar3.f8712L0;
                                if (gVar == null) {
                                    l.j("voiceSelectorManager");
                                    throw null;
                                }
                                Intent intent = bVar3.f8714N0;
                                l.b(intent);
                                gVar.b(intent);
                                return;
                            } catch (Throwable unused) {
                                ActivityUtilsKt.showErrorDialog$default(bVar3.g0(), null, "Đã xảy ra lỗi vui lòng thử lại sau", null, null, null, false, false, false, null, null, 1021, null);
                                return;
                            }
                        }
                        O9.a aVar = bVar3.f8713M0;
                        if (aVar == null) {
                            l.j("logger");
                            throw null;
                        }
                        c2.i.v(aVar, Oa.c.f7534c);
                        La.g gVar2 = bVar3.f8712L0;
                        if (gVar2 == null) {
                            l.j("voiceSelectorManager");
                            throw null;
                        }
                        gVar2.c();
                        bVar3.u0();
                        return;
                    case 1:
                        b bVar4 = this.f8709b;
                        O9.a aVar2 = bVar4.f8713M0;
                        if (aVar2 == null) {
                            l.j("logger");
                            throw null;
                        }
                        c2.i.v(aVar2, Oa.b.f7533c);
                        La.g gVar3 = bVar4.f8712L0;
                        if (gVar3 == null) {
                            l.j("voiceSelectorManager");
                            throw null;
                        }
                        gVar3.f();
                        bVar4.u0();
                        return;
                    default:
                        b bVar5 = this.f8709b;
                        O9.a aVar3 = bVar5.f8713M0;
                        if (aVar3 == null) {
                            l.j("logger");
                            throw null;
                        }
                        c2.i.v(aVar3, Oa.a.f7532c);
                        La.g gVar4 = bVar5.f8712L0;
                        if (gVar4 == null) {
                            l.j("voiceSelectorManager");
                            throw null;
                        }
                        SharedPreferences.Editor edit = gVar4.f6440d.edit();
                        edit.putBoolean("key:GG_ALWAYS", true);
                        edit.commit();
                        La.g gVar5 = bVar5.f8712L0;
                        if (gVar5 == null) {
                            l.j("voiceSelectorManager");
                            throw null;
                        }
                        gVar5.f();
                        bVar5.u0();
                        return;
                }
            }
        });
    }
}
