package ya;

import A9.O0;
import A9.Q;
import A9.S;
import Ba.o;
import W1.C0558a;
import W1.C0578v;
import W1.C0581y;
import W1.O;
import W1.U;
import a.AbstractC0672a;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import cc.F;
import com.kt.apps.core.base.leanback.BrowseFrameLayout;
import com.kt.apps.core.update.AppUpdateRepository;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l2.H;
import m4.C1593w;
import r7.C1947c;
import y9.AbstractC2464g;

/* loaded from: classes2.dex */
public final class j extends AbstractC2464g<pa.i> implements S {

    /* renamed from: p0, reason: collision with root package name */
    public AppUpdateRepository f27567p0;

    /* renamed from: q0, reason: collision with root package name */
    public c f27568q0;

    /* renamed from: r0, reason: collision with root package name */
    public final O0 f27569r0 = vc.i.o(this, w.a(v9.b.class), new g(0, this), new g(1, this), new g(2, this));

    /* renamed from: s0, reason: collision with root package name */
    public c f27570s0;

    /* renamed from: t0, reason: collision with root package name */
    public final C0578v f27571t0;

    public j() {
        O o10 = new O(1);
        a aVar = new a(this);
        R7.b bVar = new R7.b(this, 6);
        if (this.f10283a > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference = new AtomicReference();
        C0581y c0581y = new C0581y(this, bVar, atomicReference, o10, aVar);
        if (this.f10283a >= 0) {
            c0581y.a();
        } else {
            this.f10298j0.add(c0581y);
        }
        this.f27571t0 = new C0578v(atomicReference);
    }

    @Override // y9.AbstractC2464g, W1.C
    public final void V() {
        this.f27567p0 = null;
        super.V();
    }

    @Override // y9.AbstractC2464g, W1.C
    public final void a0(Bundle bundle) {
    }

    @Override // A9.S
    public final Q h() {
        return new Q(this);
    }

    @Override // y9.AbstractC2464g
    public final int p0() {
        return R.layout.fragment_info;
    }

    @Override // y9.AbstractC2464g
    public final String q0() {
        return "FragmentInfo";
    }

    @Override // y9.AbstractC2464g
    public final void r0(Bundle bundle) {
        pa.i iVar = (pa.i) o0();
        final int i7 = 0;
        iVar.f23239C.setOnClickListener(new View.OnClickListener() { // from class: ya.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        j jVar = this;
                        Context C2 = jVar.C();
                        if (C2 != null && true == ActivityUtilsKt.isPermissionWriteExternalStorageGranted(C2)) {
                            jVar.t0();
                            return;
                        }
                        jVar.f27570s0 = new c(0, jVar);
                        int i10 = Build.VERSION.SDK_INT;
                        C0578v c0578v = jVar.f27571t0;
                        if (i10 >= 34) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
                            return;
                        } else if (i10 >= 33) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
                            return;
                        } else {
                            c0578v.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
                            return;
                        }
                    case 1:
                        j jVar2 = this;
                        U j = jVar2.g0().j();
                        j.getClass();
                        C0558a c0558a = new C0558a(j);
                        CharSequence text = ((pa.i) jVar2.o0()).f23242F.getText();
                        l.d(text, "getText(...)");
                        String strToGenerateQrCode = ac.g.v0(text).toString();
                        l.e(strToGenerateQrCode, "strToGenerateQrCode");
                        v9.c cVar = new v9.c();
                        cVar.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a.g(android.R.id.content, cVar, null, 1);
                        c0558a.c(null);
                        c0558a.e(false);
                        return;
                    case 2:
                        j jVar3 = this;
                        U j10 = jVar3.g0().j();
                        j10.getClass();
                        C0558a c0558a2 = new C0558a(j10);
                        CharSequence text2 = ((pa.i) jVar3.o0()).f23245I.getText();
                        l.d(text2, "getText(...)");
                        String strToGenerateQrCode2 = ac.g.v0(text2).toString();
                        l.e(strToGenerateQrCode2, "strToGenerateQrCode");
                        v9.c cVar2 = new v9.c();
                        cVar2.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode2), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a2.g(android.R.id.content, cVar2, null, 1);
                        c0558a2.c(null);
                        c0558a2.e(false);
                        return;
                    case 3:
                        j jVar4 = this;
                        U j11 = jVar4.g0().j();
                        j11.getClass();
                        C0558a c0558a3 = new C0558a(j11);
                        CharSequence text3 = ((pa.i) jVar4.o0()).f23243G.getText();
                        l.d(text3, "getText(...)");
                        String strToGenerateQrCode3 = ac.g.v0(text3).toString();
                        l.e(strToGenerateQrCode3, "strToGenerateQrCode");
                        v9.c cVar3 = new v9.c();
                        cVar3.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode3), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a3.g(android.R.id.content, cVar3, null, 1);
                        c0558a3.c(null);
                        c0558a3.e(false);
                        return;
                    default:
                        c cVar4 = this.f27568q0;
                        if (cVar4 != null) {
                            cVar4.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        pa.i iVar2 = (pa.i) o0();
        final int i10 = 1;
        iVar2.f23242F.setOnClickListener(new View.OnClickListener() { // from class: ya.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        j jVar = this;
                        Context C2 = jVar.C();
                        if (C2 != null && true == ActivityUtilsKt.isPermissionWriteExternalStorageGranted(C2)) {
                            jVar.t0();
                            return;
                        }
                        jVar.f27570s0 = new c(0, jVar);
                        int i102 = Build.VERSION.SDK_INT;
                        C0578v c0578v = jVar.f27571t0;
                        if (i102 >= 34) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
                            return;
                        } else if (i102 >= 33) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
                            return;
                        } else {
                            c0578v.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
                            return;
                        }
                    case 1:
                        j jVar2 = this;
                        U j = jVar2.g0().j();
                        j.getClass();
                        C0558a c0558a = new C0558a(j);
                        CharSequence text = ((pa.i) jVar2.o0()).f23242F.getText();
                        l.d(text, "getText(...)");
                        String strToGenerateQrCode = ac.g.v0(text).toString();
                        l.e(strToGenerateQrCode, "strToGenerateQrCode");
                        v9.c cVar = new v9.c();
                        cVar.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a.g(android.R.id.content, cVar, null, 1);
                        c0558a.c(null);
                        c0558a.e(false);
                        return;
                    case 2:
                        j jVar3 = this;
                        U j10 = jVar3.g0().j();
                        j10.getClass();
                        C0558a c0558a2 = new C0558a(j10);
                        CharSequence text2 = ((pa.i) jVar3.o0()).f23245I.getText();
                        l.d(text2, "getText(...)");
                        String strToGenerateQrCode2 = ac.g.v0(text2).toString();
                        l.e(strToGenerateQrCode2, "strToGenerateQrCode");
                        v9.c cVar2 = new v9.c();
                        cVar2.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode2), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a2.g(android.R.id.content, cVar2, null, 1);
                        c0558a2.c(null);
                        c0558a2.e(false);
                        return;
                    case 3:
                        j jVar4 = this;
                        U j11 = jVar4.g0().j();
                        j11.getClass();
                        C0558a c0558a3 = new C0558a(j11);
                        CharSequence text3 = ((pa.i) jVar4.o0()).f23243G.getText();
                        l.d(text3, "getText(...)");
                        String strToGenerateQrCode3 = ac.g.v0(text3).toString();
                        l.e(strToGenerateQrCode3, "strToGenerateQrCode");
                        v9.c cVar3 = new v9.c();
                        cVar3.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode3), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a3.g(android.R.id.content, cVar3, null, 1);
                        c0558a3.c(null);
                        c0558a3.e(false);
                        return;
                    default:
                        c cVar4 = this.f27568q0;
                        if (cVar4 != null) {
                            cVar4.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        pa.i iVar3 = (pa.i) o0();
        final int i11 = 2;
        iVar3.f23245I.setOnClickListener(new View.OnClickListener() { // from class: ya.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        j jVar = this;
                        Context C2 = jVar.C();
                        if (C2 != null && true == ActivityUtilsKt.isPermissionWriteExternalStorageGranted(C2)) {
                            jVar.t0();
                            return;
                        }
                        jVar.f27570s0 = new c(0, jVar);
                        int i102 = Build.VERSION.SDK_INT;
                        C0578v c0578v = jVar.f27571t0;
                        if (i102 >= 34) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
                            return;
                        } else if (i102 >= 33) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
                            return;
                        } else {
                            c0578v.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
                            return;
                        }
                    case 1:
                        j jVar2 = this;
                        U j = jVar2.g0().j();
                        j.getClass();
                        C0558a c0558a = new C0558a(j);
                        CharSequence text = ((pa.i) jVar2.o0()).f23242F.getText();
                        l.d(text, "getText(...)");
                        String strToGenerateQrCode = ac.g.v0(text).toString();
                        l.e(strToGenerateQrCode, "strToGenerateQrCode");
                        v9.c cVar = new v9.c();
                        cVar.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a.g(android.R.id.content, cVar, null, 1);
                        c0558a.c(null);
                        c0558a.e(false);
                        return;
                    case 2:
                        j jVar3 = this;
                        U j10 = jVar3.g0().j();
                        j10.getClass();
                        C0558a c0558a2 = new C0558a(j10);
                        CharSequence text2 = ((pa.i) jVar3.o0()).f23245I.getText();
                        l.d(text2, "getText(...)");
                        String strToGenerateQrCode2 = ac.g.v0(text2).toString();
                        l.e(strToGenerateQrCode2, "strToGenerateQrCode");
                        v9.c cVar2 = new v9.c();
                        cVar2.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode2), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a2.g(android.R.id.content, cVar2, null, 1);
                        c0558a2.c(null);
                        c0558a2.e(false);
                        return;
                    case 3:
                        j jVar4 = this;
                        U j11 = jVar4.g0().j();
                        j11.getClass();
                        C0558a c0558a3 = new C0558a(j11);
                        CharSequence text3 = ((pa.i) jVar4.o0()).f23243G.getText();
                        l.d(text3, "getText(...)");
                        String strToGenerateQrCode3 = ac.g.v0(text3).toString();
                        l.e(strToGenerateQrCode3, "strToGenerateQrCode");
                        v9.c cVar3 = new v9.c();
                        cVar3.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode3), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a3.g(android.R.id.content, cVar3, null, 1);
                        c0558a3.c(null);
                        c0558a3.e(false);
                        return;
                    default:
                        c cVar4 = this.f27568q0;
                        if (cVar4 != null) {
                            cVar4.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        pa.i iVar4 = (pa.i) o0();
        final int i12 = 3;
        iVar4.f23243G.setOnClickListener(new View.OnClickListener() { // from class: ya.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        j jVar = this;
                        Context C2 = jVar.C();
                        if (C2 != null && true == ActivityUtilsKt.isPermissionWriteExternalStorageGranted(C2)) {
                            jVar.t0();
                            return;
                        }
                        jVar.f27570s0 = new c(0, jVar);
                        int i102 = Build.VERSION.SDK_INT;
                        C0578v c0578v = jVar.f27571t0;
                        if (i102 >= 34) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
                            return;
                        } else if (i102 >= 33) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
                            return;
                        } else {
                            c0578v.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
                            return;
                        }
                    case 1:
                        j jVar2 = this;
                        U j = jVar2.g0().j();
                        j.getClass();
                        C0558a c0558a = new C0558a(j);
                        CharSequence text = ((pa.i) jVar2.o0()).f23242F.getText();
                        l.d(text, "getText(...)");
                        String strToGenerateQrCode = ac.g.v0(text).toString();
                        l.e(strToGenerateQrCode, "strToGenerateQrCode");
                        v9.c cVar = new v9.c();
                        cVar.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a.g(android.R.id.content, cVar, null, 1);
                        c0558a.c(null);
                        c0558a.e(false);
                        return;
                    case 2:
                        j jVar3 = this;
                        U j10 = jVar3.g0().j();
                        j10.getClass();
                        C0558a c0558a2 = new C0558a(j10);
                        CharSequence text2 = ((pa.i) jVar3.o0()).f23245I.getText();
                        l.d(text2, "getText(...)");
                        String strToGenerateQrCode2 = ac.g.v0(text2).toString();
                        l.e(strToGenerateQrCode2, "strToGenerateQrCode");
                        v9.c cVar2 = new v9.c();
                        cVar2.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode2), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a2.g(android.R.id.content, cVar2, null, 1);
                        c0558a2.c(null);
                        c0558a2.e(false);
                        return;
                    case 3:
                        j jVar4 = this;
                        U j11 = jVar4.g0().j();
                        j11.getClass();
                        C0558a c0558a3 = new C0558a(j11);
                        CharSequence text3 = ((pa.i) jVar4.o0()).f23243G.getText();
                        l.d(text3, "getText(...)");
                        String strToGenerateQrCode3 = ac.g.v0(text3).toString();
                        l.e(strToGenerateQrCode3, "strToGenerateQrCode");
                        v9.c cVar3 = new v9.c();
                        cVar3.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode3), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a3.g(android.R.id.content, cVar3, null, 1);
                        c0558a3.c(null);
                        c0558a3.e(false);
                        return;
                    default:
                        c cVar4 = this.f27568q0;
                        if (cVar4 != null) {
                            cVar4.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        pa.i iVar5 = (pa.i) o0();
        final int i13 = 4;
        iVar5.f23240D.setOnClickListener(new View.OnClickListener() { // from class: ya.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        j jVar = this;
                        Context C2 = jVar.C();
                        if (C2 != null && true == ActivityUtilsKt.isPermissionWriteExternalStorageGranted(C2)) {
                            jVar.t0();
                            return;
                        }
                        jVar.f27570s0 = new c(0, jVar);
                        int i102 = Build.VERSION.SDK_INT;
                        C0578v c0578v = jVar.f27571t0;
                        if (i102 >= 34) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
                            return;
                        } else if (i102 >= 33) {
                            c0578v.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
                            return;
                        } else {
                            c0578v.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
                            return;
                        }
                    case 1:
                        j jVar2 = this;
                        U j = jVar2.g0().j();
                        j.getClass();
                        C0558a c0558a = new C0558a(j);
                        CharSequence text = ((pa.i) jVar2.o0()).f23242F.getText();
                        l.d(text, "getText(...)");
                        String strToGenerateQrCode = ac.g.v0(text).toString();
                        l.e(strToGenerateQrCode, "strToGenerateQrCode");
                        v9.c cVar = new v9.c();
                        cVar.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a.g(android.R.id.content, cVar, null, 1);
                        c0558a.c(null);
                        c0558a.e(false);
                        return;
                    case 2:
                        j jVar3 = this;
                        U j10 = jVar3.g0().j();
                        j10.getClass();
                        C0558a c0558a2 = new C0558a(j10);
                        CharSequence text2 = ((pa.i) jVar3.o0()).f23245I.getText();
                        l.d(text2, "getText(...)");
                        String strToGenerateQrCode2 = ac.g.v0(text2).toString();
                        l.e(strToGenerateQrCode2, "strToGenerateQrCode");
                        v9.c cVar2 = new v9.c();
                        cVar2.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode2), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a2.g(android.R.id.content, cVar2, null, 1);
                        c0558a2.c(null);
                        c0558a2.e(false);
                        return;
                    case 3:
                        j jVar4 = this;
                        U j11 = jVar4.g0().j();
                        j11.getClass();
                        C0558a c0558a3 = new C0558a(j11);
                        CharSequence text3 = ((pa.i) jVar4.o0()).f23243G.getText();
                        l.d(text3, "getText(...)");
                        String strToGenerateQrCode3 = ac.g.v0(text3).toString();
                        l.e(strToGenerateQrCode3, "strToGenerateQrCode");
                        v9.c cVar3 = new v9.c();
                        cVar3.l0(com.bumptech.glide.c.f(new Db.j("extra:generate_qr_code", strToGenerateQrCode3), new Db.j("extra:is_image_mode", Boolean.FALSE)));
                        c0558a3.g(android.R.id.content, cVar3, null, 1);
                        c0558a3.c(null);
                        c0558a3.e(false);
                        return;
                    default:
                        c cVar4 = this.f27568q0;
                        if (cVar4 != null) {
                            cVar4.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        View view = ((pa.i) o0()).f5434e;
        l.c(view, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.BrowseFrameLayout");
        ((BrowseFrameLayout) view).setOnFirstChildFocusListener(new a(this));
        View view2 = ((pa.i) o0()).f5434e;
        l.c(view2, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.BrowseFrameLayout");
        ((BrowseFrameLayout) view2).setOnFocusSearchListener(new a(this));
        ((H) ((v9.b) this.f27569r0.getValue()).f25262a.getValue()).e(H(), new Ba.j(new Ba.i(27), 7));
        u0(3);
    }

    @Override // y9.AbstractC2464g
    public final void s0() {
        pa.i iVar = (pa.i) o0();
        iVar.f5434e.setNextFocusRightId(((pa.i) o0()).f23239C.getId());
        pa.i iVar2 = (pa.i) o0();
        iVar2.f23244H.setText(F().getString(R.string.version_title, "25.08.06.B"));
        View view = ((pa.i) o0()).f5434e;
        l.c(view, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.BrowseFrameLayout");
        ((BrowseFrameLayout) view).setDescendantFocusability(262144);
    }

    public final void t0() {
        if (this.f27567p0 == null) {
            AppUpdateRepository.Companion companion = AppUpdateRepository.Companion;
            Application application = g0().getApplication();
            l.d(application, "getApplication(...)");
            this.f27567p0 = companion.getInstance(application);
        }
        ((pa.i) o0()).f23239C.setEnabled(false);
        ((pa.i) o0()).f23239C.setText("Đang kiểm tra...");
        ((pa.i) o0()).f23239C.setIconResource(android.R.drawable.ic_popup_sync);
        F.B(l2.Q.f(this), null, 0, new f(this, null), 3);
    }

    public final void u0(int i7) {
        AbstractC0672a.i().a().addOnSuccessListener(new C1947c(new o(this, 28), 23)).addOnFailureListener(new C1593w(i7, this));
    }
}
