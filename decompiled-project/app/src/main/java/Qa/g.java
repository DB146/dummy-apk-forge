package Qa;

import A9.N2;
import A9.R2;
import Db.o;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.voiceselector.AppItemView;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import y6.C2399e;
import y7.u0;

/* loaded from: classes2.dex */
public final class g extends e<Ma.d> {

    /* renamed from: P0, reason: collision with root package name */
    public static final C2399e f8728P0 = new C2399e(13);

    /* renamed from: K0, reason: collision with root package name */
    public Pa.d f8729K0;

    /* renamed from: L0, reason: collision with root package name */
    public La.g f8730L0;

    /* renamed from: M0, reason: collision with root package name */
    public O9.a f8731M0;

    /* renamed from: N0, reason: collision with root package name */
    public Intent f8732N0;

    /* renamed from: O0, reason: collision with root package name */
    public final o f8733O0 = android.support.v4.media.session.b.z(new N2(this, 16));

    @Override // Qa.e, W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public final void R(Context context) {
        l.e(context, "context");
        super.R(context);
    }

    @Override // y9.AbstractC2463f, W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public final void b0() {
        super.b0();
        w0().I(3);
        ((Ma.d) v0()).f6930D.requestFocus();
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u
    public final int p0() {
        return R.style.BottomSheetDialog;
    }

    @Override // y9.AbstractC2463f
    public final int x0() {
        return R.layout.fragment_voice_selector_dialog;
    }

    @Override // y9.AbstractC2463f
    public final void y0() {
        final int i7 = 1;
        final int i10 = 0;
        r0();
        Object obj = h0().get("extra:voice_intent");
        this.f8732N0 = obj instanceof Intent ? (Intent) obj : null;
        if (this.f8729K0 == null) {
            l.j("voicePackage");
            throw null;
        }
        o oVar = this.f8733O0;
        AppItemView appItemView = (AppItemView) oVar.getValue();
        if (this.f8729K0 == null) {
            l.j("voicePackage");
            throw null;
        }
        appItemView.setTitle("");
        AppItemView appItemView2 = (AppItemView) oVar.getValue();
        if (this.f8729K0 == null) {
            l.j("voicePackage");
            throw null;
        }
        appItemView2.setDescriptionValue("");
        if (this.f8732N0 != null) {
            ((Ma.d) v0()).f6930D.setText(F().getString(R.string.use));
        }
        Iterator it = u0.f(((Ma.d) v0()).f6930D, ((Ma.d) v0()).f6931E).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: Qa.f

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f8727b;

                {
                    this.f8727b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            g gVar = this.f8727b;
                            if (gVar.f8732N0 != null) {
                                gVar.u0();
                                try {
                                    La.g gVar2 = gVar.f8730L0;
                                    if (gVar2 == null) {
                                        l.j("voiceSelectorManager");
                                        throw null;
                                    }
                                    Intent intent = gVar.f8732N0;
                                    l.b(intent);
                                    gVar2.b(intent);
                                    return;
                                } catch (Throwable unused) {
                                    ActivityUtilsKt.showErrorDialog$default(gVar.g0(), null, "Đã xảy ra lỗi vui lòng thử lại sau", null, null, null, false, false, false, null, null, 1021, null);
                                    return;
                                }
                            }
                            O9.a aVar = gVar.f8731M0;
                            if (aVar == null) {
                                l.j("logger");
                                throw null;
                            }
                            c2.i.v(aVar, Oa.c.f7534c);
                            La.g gVar3 = gVar.f8730L0;
                            if (gVar3 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            gVar3.c();
                            gVar.u0();
                            return;
                        default:
                            g gVar4 = this.f8727b;
                            O9.a aVar2 = gVar4.f8731M0;
                            if (aVar2 == null) {
                                l.j("logger");
                                throw null;
                            }
                            c2.i.v(aVar2, Oa.b.f7533c);
                            La.g gVar5 = gVar4.f8730L0;
                            if (gVar5 == null) {
                                l.j("voiceSelectorManager");
                                throw null;
                            }
                            gVar5.f();
                            gVar4.u0();
                            return;
                    }
                }
            });
        }
        ((Ma.d) v0()).f6929C.setOnClickListener(new View.OnClickListener(this) { // from class: Qa.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f8727b;

            {
                this.f8727b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        g gVar = this.f8727b;
                        if (gVar.f8732N0 != null) {
                            gVar.u0();
                            try {
                                La.g gVar2 = gVar.f8730L0;
                                if (gVar2 == null) {
                                    l.j("voiceSelectorManager");
                                    throw null;
                                }
                                Intent intent = gVar.f8732N0;
                                l.b(intent);
                                gVar2.b(intent);
                                return;
                            } catch (Throwable unused) {
                                ActivityUtilsKt.showErrorDialog$default(gVar.g0(), null, "Đã xảy ra lỗi vui lòng thử lại sau", null, null, null, false, false, false, null, null, 1021, null);
                                return;
                            }
                        }
                        O9.a aVar = gVar.f8731M0;
                        if (aVar == null) {
                            l.j("logger");
                            throw null;
                        }
                        c2.i.v(aVar, Oa.c.f7534c);
                        La.g gVar3 = gVar.f8730L0;
                        if (gVar3 == null) {
                            l.j("voiceSelectorManager");
                            throw null;
                        }
                        gVar3.c();
                        gVar.u0();
                        return;
                    default:
                        g gVar4 = this.f8727b;
                        O9.a aVar2 = gVar4.f8731M0;
                        if (aVar2 == null) {
                            l.j("logger");
                            throw null;
                        }
                        c2.i.v(aVar2, Oa.b.f7533c);
                        La.g gVar5 = gVar4.f8730L0;
                        if (gVar5 == null) {
                            l.j("voiceSelectorManager");
                            throw null;
                        }
                        gVar5.f();
                        gVar4.u0();
                        return;
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            Button button = ((Ma.d) v0()).f6930D;
            button.setFocusedByDefault(true);
            button.setNextFocusDownId(((Ma.d) v0()).f6929C.getId());
            Ma.d dVar = (Ma.d) v0();
            int id = ((Ma.d) v0()).f6930D.getId();
            AppItemView appItemView3 = dVar.f6929C;
            appItemView3.setNextFocusUpId(id);
            appItemView3.setOnFocusChangeListener(new R2(this, 5));
        }
    }
}
