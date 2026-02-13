package T6;

import A4.s;
import Db.d;
import E5.o;
import F.Q;
import N6.H;
import N6.y0;
import P4.B;
import P4.C0463k;
import Q.C0487e0;
import R7.b;
import S6.h;
import W6.f;
import W6.g;
import W6.t;
import W6.v;
import W6.x;
import W6.y;
import Y6.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.bumptech.glide.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import com.google.firebase.auth.FirebaseAuth;
import com.kt.apps.media.xemtv.beta.R;
import e8.InterfaceC1099b;
import ea.C1108c;
import ia.C1358d;
import j8.InterfaceC1387b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import k8.C1433a;
import k8.e;
import l1.AbstractC1449a;
import m4.C1549C;
import m4.J0;
import m4.L0;
import n5.D;
import o.F0;
import o.K0;
import o.r;
import p7.InterfaceC1858b;
import p7.n;
import p7.p;
import q1.AbstractC1875a;
import q3.l;
import r7.C1947c;
import t8.C2033b;
import y.S;

/* loaded from: classes.dex */
public final class a implements InterfaceC1858b {

    /* renamed from: a, reason: collision with root package name */
    public Object f9320a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9321b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9322c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9323d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9324e;

    /* renamed from: f, reason: collision with root package name */
    public Object f9325f;

    public static boolean j(int[] iArr, int i7) {
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList l(Context context, int i7) {
        int c10 = K0.c(context, R.attr.colorControlHighlight);
        int b2 = K0.b(context, R.attr.colorButtonNormal);
        int[] iArr = K0.f21397b;
        int[] iArr2 = K0.f21399d;
        int f4 = AbstractC1875a.f(c10, i7);
        return new ColorStateList(new int[][]{iArr, iArr2, K0.f21398c, K0.f21401f}, new int[]{b2, f4, AbstractC1875a.f(c10, i7), i7});
    }

    public static B n(C1549C c1549c, H h10, B b2, J0 j02) {
        L0 Y2 = c1549c.Y();
        int V7 = c1549c.V();
        Object l10 = Y2.p() ? null : Y2.l(V7);
        int b10 = (c1549c.g0() || Y2.p()) ? -1 : Y2.f(V7, j02, false).b(D.M(c1549c.W()) - j02.f19967e);
        for (int i7 = 0; i7 < h10.size(); i7++) {
            B b11 = (B) h10.get(i7);
            if (q(b11, l10, c1549c.g0(), c1549c.S(), c1549c.T(), b10)) {
                return b11;
            }
        }
        if (h10.isEmpty() && b2 != null) {
            if (q(b2, l10, c1549c.g0(), c1549c.S(), c1549c.T(), b10)) {
                return b2;
            }
        }
        return null;
    }

    public static LayerDrawable o(F0 f02, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable c10 = f02.c(context, R.drawable.abc_star_black_48dp);
        Drawable c11 = f02.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c10 instanceof BitmapDrawable) && c10.getIntrinsicWidth() == dimensionPixelSize && c10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c10;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c10.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c11 instanceof BitmapDrawable) && c11.getIntrinsicWidth() == dimensionPixelSize && c11.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c11;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c11.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean q(B b2, Object obj, boolean z8, int i7, int i10, int i11) {
        if (!b2.f8157a.equals(obj)) {
            return false;
        }
        int i12 = b2.f8158b;
        return (z8 && i12 == i7 && b2.f8159c == i10) || (!z8 && i12 == -1 && b2.f8161e == i11);
    }

    public static void v(Drawable drawable, int i7, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = r.f21579b;
        }
        mutate.setColorFilter(r.c(i7, mode));
    }

    public Task A(String str) {
        Task task;
        synchronized (this.f9320a) {
            task = (Task) ((HashMap) this.f9321b).get(str);
        }
        return task;
    }

    @Override // p7.InterfaceC1858b
    public Object a(Class cls) {
        if (!((Set) this.f9320a).contains(p.a(cls))) {
            throw new d("Attempting to request an undeclared dependency " + cls + ".", 12);
        }
        Object a9 = ((InterfaceC1858b) this.f9325f).a(cls);
        if (!cls.equals(InterfaceC1099b.class)) {
            return a9;
        }
        return new Object();
    }

    @Override // p7.InterfaceC1858b
    public Set b(p pVar) {
        if (((Set) this.f9323d).contains(pVar)) {
            return ((InterfaceC1858b) this.f9325f).b(pVar);
        }
        throw new d("Attempting to request an undeclared dependency Set<" + pVar + ">.", 12);
    }

    @Override // p7.InterfaceC1858b
    public InterfaceC1387b c(p pVar) {
        if (((Set) this.f9324e).contains(pVar)) {
            return ((InterfaceC1858b) this.f9325f).c(pVar);
        }
        throw new d("Attempting to request an undeclared dependency Provider<Set<" + pVar + ">>.", 12);
    }

    @Override // p7.InterfaceC1858b
    public InterfaceC1387b d(Class cls) {
        return h(p.a(cls));
    }

    @Override // p7.InterfaceC1858b
    public n e(p pVar) {
        if (((Set) this.f9322c).contains(pVar)) {
            return ((InterfaceC1858b) this.f9325f).e(pVar);
        }
        throw new d("Attempting to request an undeclared dependency Deferred<" + pVar + ">.", 12);
    }

    @Override // p7.InterfaceC1858b
    public n f(Class cls) {
        return e(p.a(cls));
    }

    @Override // p7.InterfaceC1858b
    public Object g(p pVar) {
        if (((Set) this.f9320a).contains(pVar)) {
            return ((InterfaceC1858b) this.f9325f).g(pVar);
        }
        throw new d("Attempting to request an undeclared dependency " + pVar + ".", 12);
    }

    @Override // p7.InterfaceC1858b
    public InterfaceC1387b h(p pVar) {
        if (((Set) this.f9321b).contains(pVar)) {
            return ((InterfaceC1858b) this.f9325f).h(pVar);
        }
        throw new d("Attempting to request an undeclared dependency Provider<" + pVar + ">.", 12);
    }

    public void i(s sVar, B b2, L0 l02) {
        if (b2 == null) {
            return;
        }
        if (l02.b(b2.f8157a) != -1) {
            sVar.B(b2, l02);
            return;
        }
        L0 l03 = (L0) ((y0) this.f9322c).get(b2);
        if (l03 != null) {
            sVar.B(b2, l03);
        }
    }

    public synchronized C0463k k() {
        C0463k c0463k;
        try {
            if (((String) this.f9322c) != null) {
                this.f9323d = t();
            }
            this.f9325f = s();
            c0463k = new C0463k(6, false);
            c0463k.f8074b = (R7.a) this.f9325f;
        } catch (Throwable th) {
            throw th;
        }
        return c0463k;
    }

    public Task m(Task task) {
        return task.continueWith(new E2.d(0), new C1947c(this, 1));
    }

    public ColorStateList p(Context context, int i7) {
        if (i7 == R.drawable.abc_edit_text_material) {
            return AbstractC1449a.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i7 == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC1449a.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i7 != R.drawable.abc_switch_thumb_material) {
            if (i7 == R.drawable.abc_btn_default_mtrl_shape) {
                return l(context, K0.c(context, R.attr.colorButtonNormal));
            }
            if (i7 == R.drawable.abc_btn_borderless_material) {
                return l(context, 0);
            }
            if (i7 == R.drawable.abc_btn_colored_material) {
                return l(context, K0.c(context, R.attr.colorAccent));
            }
            if (i7 == R.drawable.abc_spinner_mtrl_am_alpha || i7 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC1449a.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (j((int[]) this.f9321b, i7)) {
                return K0.d(context, R.attr.colorControlNormal);
            }
            if (j((int[]) this.f9324e, i7)) {
                return AbstractC1449a.getColorStateList(context, R.color.abc_tint_default);
            }
            if (j((int[]) this.f9325f, i7)) {
                return AbstractC1449a.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i7 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1449a.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList d10 = K0.d(context, R.attr.colorSwitchThumbNormal);
        if (d10 == null || !d10.isStateful()) {
            iArr[0] = K0.f21397b;
            iArr2[0] = K0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = K0.f21400e;
            iArr2[1] = K0.c(context, R.attr.colorControlActivated);
            iArr[2] = K0.f21401f;
            iArr2[2] = K0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = K0.f21397b;
            iArr[0] = iArr3;
            iArr2[0] = d10.getColorForState(iArr3, 0);
            iArr[1] = K0.f21400e;
            iArr2[1] = K0.c(context, R.attr.colorControlActivated);
            iArr[2] = K0.f21401f;
            iArr2[2] = d10.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean r() {
        return ((Boolean) ((C0487e0) this.f9323d).getValue()).booleanValue();
    }

    public R7.a s() {
        byte[] w10;
        int i7 = 2;
        try {
            R7.a aVar = (R7.a) this.f9323d;
            if (aVar != null) {
                try {
                    y yVar = (y) C0463k.A((C0463k) this.f9320a, aVar).f8074b;
                    AbstractC1026u abstractC1026u = (AbstractC1026u) yVar.f(5);
                    abstractC1026u.d(yVar);
                    return new R7.a((v) abstractC1026u, i7);
                } catch (C | GeneralSecurityException e2) {
                    Log.w("k", "cannot decrypt keyset: ", e2);
                }
            }
            y t5 = y.t(((C0463k) this.f9320a).B(), C1021o.a());
            if (t5.p() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            AbstractC1026u abstractC1026u2 = (AbstractC1026u) t5.f(5);
            abstractC1026u2.d(t5);
            return new R7.a((v) abstractC1026u2, i7);
        } catch (FileNotFoundException e10) {
            Log.w("k", "keyset not found, will generate a new one", e10);
            if (((b) this.f9324e) == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            v s3 = y.s();
            R7.a aVar2 = new R7.a(s3, i7);
            b bVar = (b) this.f9324e;
            synchronized (aVar2) {
                t tVar = (t) bVar.f8929b;
                synchronized (aVar2) {
                    x C2 = aVar2.C(tVar);
                    s3.c();
                    y.n((y) s3.f15819b, C2);
                    int q10 = h.a((y) aVar2.x().f8074b).o().q();
                    synchronized (aVar2) {
                        for (int i10 = 0; i10 < ((y) ((v) aVar2.f8927b).f15819b).p(); i10++) {
                            try {
                                x o10 = ((y) ((v) aVar2.f8927b).f15819b).o(i10);
                                if (o10.r() == q10) {
                                    if (!o10.t().equals(W6.r.ENABLED)) {
                                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + q10);
                                    }
                                    v vVar = (v) aVar2.f8927b;
                                    vVar.c();
                                    y.m((y) vVar.f15819b, q10);
                                    if (((R7.a) this.f9323d) != null) {
                                        C0463k x2 = aVar2.x();
                                        R7.a aVar3 = (R7.a) this.f9321b;
                                        R7.a aVar4 = (R7.a) this.f9323d;
                                        y yVar2 = (y) x2.f8074b;
                                        byte[] c10 = yVar2.c();
                                        byte[] bArr = new byte[0];
                                        aVar4.getClass();
                                        try {
                                            w10 = aVar4.w(c10, bArr);
                                        } catch (GeneralSecurityException | ProviderException e11) {
                                            Log.w("a", "encountered a potentially transient KeyStore error, will wait and retry", e11);
                                            try {
                                                Thread.sleep((int) (Math.random() * 100.0d));
                                            } catch (InterruptedException unused) {
                                            }
                                            w10 = aVar4.w(c10, bArr);
                                        }
                                        try {
                                            if (!y.t(aVar4.q(w10, new byte[0]), C1021o.a()).equals(yVar2)) {
                                                throw new GeneralSecurityException("cannot encrypt keyset");
                                            }
                                            f p10 = g.p();
                                            C1013g o11 = AbstractC1014h.o(0, w10, w10.length);
                                            p10.c();
                                            g.m((g) p10.f15819b, o11);
                                            W6.C a9 = h.a(yVar2);
                                            p10.c();
                                            g.n((g) p10.f15819b, a9);
                                            g gVar = (g) p10.a();
                                            aVar3.getClass();
                                            if (!((SharedPreferences.Editor) aVar3.f8927b).putString("core-google-shortcuts.TINK_KEYSET", c.x(gVar.c())).commit()) {
                                                throw new IOException("Failed to write to SharedPreferences");
                                            }
                                        } catch (C unused2) {
                                            throw new GeneralSecurityException("invalid keyset, corrupted key material");
                                        }
                                    } else {
                                        C0463k x10 = aVar2.x();
                                        R7.a aVar5 = (R7.a) this.f9321b;
                                        y yVar3 = (y) x10.f8074b;
                                        aVar5.getClass();
                                        if (!((SharedPreferences.Editor) aVar5.f8927b).putString("core-google-shortcuts.TINK_KEYSET", c.x(yVar3.c())).commit()) {
                                            throw new IOException("Failed to write to SharedPreferences");
                                        }
                                    }
                                    return aVar2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        throw new GeneralSecurityException("key not found: " + q10);
                    }
                }
            }
        }
    }

    public R7.a t() {
        b bVar = new b(4);
        boolean r10 = bVar.r((String) this.f9322c);
        if (!r10) {
            try {
                b.o((String) this.f9322c);
            } catch (GeneralSecurityException | ProviderException e2) {
                Log.w("k", "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
        }
        try {
            return bVar.q((String) this.f9322c);
        } catch (GeneralSecurityException | ProviderException e10) {
            if (r10) {
                throw new KeyStoreException(S.b("the master key ", (String) this.f9322c, " exists but is unusable"), e10);
            }
            Log.w("k", "cannot use Android Keystore, it'll be disabled", e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(String str, String str2, Bundle bundle) {
        int i7;
        String str3;
        String str4;
        h8.g gVar;
        boolean g;
        int i10;
        PackageInfo d10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        i iVar = (i) this.f9320a;
        iVar.b();
        bundle.putString("gmp_app_id", iVar.f12043c.f12055b);
        Q q10 = (Q) this.f9321b;
        synchronized (q10) {
            try {
                if (q10.f3936a == 0 && (d10 = q10.d("com.google.android.gms")) != null) {
                    q10.f3936a = d10.versionCode;
                }
                i7 = q10.f3936a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i7));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((Q) this.f9321b).b());
        Q q11 = (Q) this.f9321b;
        synchronized (q11) {
            try {
                if (((String) q11.f3940e) == null) {
                    q11.f();
                }
                str3 = (String) q11.f3940e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        i iVar2 = (i) this.f9320a;
        iVar2.b();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(iVar2.f12042b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((C1433a) Tasks.await(((k8.d) ((e) this.f9325f)).d())).f19028a;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((k8.d) ((e) this.f9325f)).c()));
            bundle.putString("cliv", "fcm-24.1.2");
            gVar = (h8.g) ((InterfaceC1387b) this.f9324e).get();
            C2033b c2033b = (C2033b) ((InterfaceC1387b) this.f9323d).get();
            if (gVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((k8.d) ((e) this.f9325f)).c()));
            bundle.putString("cliv", "fcm-24.1.2");
            gVar = (h8.g) ((InterfaceC1387b) this.f9324e).get();
            C2033b c2033b2 = (C2033b) ((InterfaceC1387b) this.f9323d).get();
            if (gVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((k8.d) ((e) this.f9325f)).c()));
        bundle.putString("cliv", "fcm-24.1.2");
        gVar = (h8.g) ((InterfaceC1387b) this.f9324e).get();
        C2033b c2033b22 = (C2033b) ((InterfaceC1387b) this.f9323d).get();
        if (gVar == null || c2033b22 == null) {
            return;
        }
        h8.d dVar = (h8.d) gVar;
        synchronized (dVar) {
            long currentTimeMillis = System.currentTimeMillis();
            h8.h hVar = (h8.h) dVar.f17873a.get();
            synchronized (hVar) {
                g = hVar.g(currentTimeMillis);
            }
            if (g) {
                synchronized (hVar) {
                    String d11 = hVar.d(System.currentTimeMillis());
                    hVar.f17891a.edit().putString("last-used-date", d11).commit();
                    hVar.f(d11);
                }
                i10 = 3;
            } else {
                i10 = 1;
            }
        }
        if (i10 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(P.c.b(i10)));
            bundle.putString("Firebase-Client", c2033b22.a());
        }
    }

    public Task w(String str, String str2, Bundle bundle) {
        int i7;
        try {
            u(str, str2, bundle);
            E5.b bVar = (E5.b) this.f9322c;
            A4.h hVar = bVar.f3675c;
            int v10 = hVar.v();
            E5.h hVar2 = E5.h.f3687c;
            if (v10 < 12000000) {
                return hVar.w() != 0 ? bVar.a(bundle).continueWithTask(hVar2, new l(6, bVar, bundle, false)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            o j = o.j(bVar.f3674b);
            synchronized (j) {
                i7 = j.f3712a;
                j.f3712a = i7 + 1;
            }
            return j.k(new E5.n(i7, 1, bundle, 1)).continueWith(hVar2, E5.d.f3680b);
        } catch (InterruptedException | ExecutionException e2) {
            return Tasks.forException(e2);
        }
    }

    public void x(L0 l02) {
        s a9 = y0.a();
        if (((H) this.f9321b).isEmpty()) {
            i(a9, (B) this.f9324e, l02);
            if (!O5.b.o((B) this.f9325f, (B) this.f9324e)) {
                i(a9, (B) this.f9325f, l02);
            }
            if (!O5.b.o((B) this.f9323d, (B) this.f9324e) && !O5.b.o((B) this.f9323d, (B) this.f9325f)) {
                i(a9, (B) this.f9323d, l02);
            }
        } else {
            for (int i7 = 0; i7 < ((H) this.f9321b).size(); i7++) {
                i(a9, (B) ((H) this.f9321b).get(i7), l02);
            }
            if (!((H) this.f9321b).contains((B) this.f9323d)) {
                i(a9, (B) this.f9323d, l02);
            }
        }
        this.f9322c = a9.g();
    }

    public void y(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.f9320a = new C0463k(context);
        this.f9321b = new R7.a(context);
    }

    public Task z(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task continueWithTask;
        if (zzae.zzc(str)) {
            str = "*";
        }
        Task A10 = A(str);
        if (bool.booleanValue() || A10 == null) {
            String str2 = zzae.zzc(str) ? "*" : str;
            if (bool.booleanValue() || (continueWithTask = A(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f9324e;
                continueWithTask = firebaseAuth.f15832e.zza(firebaseAuth.f15835i, "RECAPTCHA_ENTERPRISE").continueWithTask(new C1108c(9, this, str2, false));
            }
            A10 = continueWithTask;
        }
        return A10.continueWithTask(new C1358d(recaptchaAction, 10));
    }
}
