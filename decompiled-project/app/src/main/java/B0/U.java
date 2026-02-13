package B0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import e0.EnumC1074a;
import u.AbstractC2059l;
import u.C2046I;

/* loaded from: classes.dex */
public final class U implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final U f1796a = new Object();

    public final boolean onClearTranslation(View view) {
        Rb.a aVar;
        kotlin.jvm.internal.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        e0.c contentCaptureManager$ui_release = ((D) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16649f = EnumC1074a.f16633a;
        AbstractC2059l c10 = contentCaptureManager$ui_release.c();
        Object[] objArr = c10.f24693c;
        long[] jArr = c10.f24691a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        H0.i iVar = ((X0) objArr[(i7 << 3) + i11]).f1809a.f4505d;
                        H0.t tVar = H0.q.f4528A;
                        C2046I c2046i = iVar.f4494a;
                        Object g = c2046i.g(tVar);
                        if (g == null) {
                            g = null;
                        }
                        if (g != null) {
                            Object g2 = c2046i.g(H0.h.f4480m);
                            H0.a aVar2 = (H0.a) (g2 != null ? g2 : null);
                            if (aVar2 != null && (aVar = (Rb.a) aVar2.f4461b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Rb.c cVar;
        kotlin.jvm.internal.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        e0.c contentCaptureManager$ui_release = ((D) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16649f = EnumC1074a.f16633a;
        AbstractC2059l c10 = contentCaptureManager$ui_release.c();
        Object[] objArr = c10.f24693c;
        long[] jArr = c10.f24691a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        H0.i iVar = ((X0) objArr[(i7 << 3) + i11]).f1809a.f4505d;
                        H0.t tVar = H0.q.f4528A;
                        C2046I c2046i = iVar.f4494a;
                        Object g = c2046i.g(tVar);
                        if (g == null) {
                            g = null;
                        }
                        if (kotlin.jvm.internal.l.a(g, Boolean.TRUE)) {
                            Object g2 = c2046i.g(H0.h.f4479l);
                            H0.a aVar = (H0.a) (g2 != null ? g2 : null);
                            if (aVar != null && (cVar = (Rb.c) aVar.f4461b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Rb.c cVar;
        kotlin.jvm.internal.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        e0.c contentCaptureManager$ui_release = ((D) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16649f = EnumC1074a.f16634b;
        AbstractC2059l c10 = contentCaptureManager$ui_release.c();
        Object[] objArr = c10.f24693c;
        long[] jArr = c10.f24691a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        H0.i iVar = ((X0) objArr[(i7 << 3) + i11]).f1809a.f4505d;
                        H0.t tVar = H0.q.f4528A;
                        C2046I c2046i = iVar.f4494a;
                        Object g = c2046i.g(tVar);
                        if (g == null) {
                            g = null;
                        }
                        if (kotlin.jvm.internal.l.a(g, Boolean.FALSE)) {
                            Object g2 = c2046i.g(H0.h.f4479l);
                            H0.a aVar = (H0.a) (g2 != null ? g2 : null);
                            if (aVar != null && (cVar = (Rb.c) aVar.f4461b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
