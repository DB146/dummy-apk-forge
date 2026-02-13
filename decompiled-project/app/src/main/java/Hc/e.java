package Hc;

import B4.g;
import E3.h;
import J3.F;
import N0.i;
import N0.k;
import N0.p;
import P3.m;
import V4.o;
import Y5.InterfaceC0650t;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzqi;
import com.google.android.gms.internal.measurement.zzql;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.beta.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import kotlin.jvm.internal.l;
import m5.L;
import s4.C1979g;
import s4.C1986n;
import s4.s;

/* loaded from: classes2.dex */
public class e implements A2.a, g, D3.a, X3.a, F, p, O7.a, m, Q5.c, V4.p, X3.c, InterfaceC0650t {

    /* renamed from: b, reason: collision with root package name */
    public static e f4932b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4943a;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e f4933c = new e(18);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e f4934d = new e(19);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e f4935e = new e(20);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e f4936f = new e(21);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ e f4937u = new e(22);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ e f4938v = new e(23);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ e f4939w = new e(24);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e f4940x = new e(25);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ e f4941y = new e(26);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ e f4942z = new e(27);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ e f4930A = new e(28);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ e f4931B = new e(29);

    public /* synthetic */ e(int i7) {
        this.f4943a = i7;
    }

    public static Typeface t(String str, k kVar, int i7) {
        Typeface create;
        if (i.a(i7, 0) && l.a(kVar, k.f7140c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f7143a, i.a(i7, 1));
        return create;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean u(T1.b bVar, Editable editable, int i7, int i10, boolean z8) {
        int min;
        if (editable == null || i7 < 0 || i10 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z8) {
            int max = Math.max(i7, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                loop0: while (true) {
                    boolean z10 = false;
                    while (true) {
                        if (max == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart >= 0) {
                            char charAt = editable.charAt(selectionStart);
                            if (z10) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt)) {
                                max--;
                            } else {
                                if (Character.isHighSurrogate(charAt)) {
                                    break loop0;
                                }
                                z10 = true;
                            }
                        } else if (!z10) {
                            selectionStart = 0;
                        }
                    }
                    max--;
                }
            }
            selectionStart = -1;
            int max2 = Math.max(i10, 0);
            min = editable.length();
            if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                loop2: while (true) {
                    boolean z11 = false;
                    while (true) {
                        if (max2 == 0) {
                            min = selectionEnd;
                            break loop2;
                        }
                        if (selectionEnd < min) {
                            char charAt2 = editable.charAt(selectionEnd);
                            if (z11) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt2)) {
                                max2--;
                                selectionEnd++;
                            } else {
                                if (Character.isLowSurrogate(charAt2)) {
                                    break loop2;
                                }
                                selectionEnd++;
                                z11 = true;
                            }
                        }
                    }
                    max2--;
                    selectionEnd++;
                }
            }
            min = -1;
            if (selectionStart == -1 || min == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i7, 0);
            min = Math.min(selectionEnd + i10, editable.length());
        }
        S1.b[] bVarArr = (S1.b[]) editable.getSpans(selectionStart, min, S1.b.class);
        if (bVarArr == null || bVarArr.length <= 0) {
            return false;
        }
        for (S1.b bVar2 : bVarArr) {
            int spanStart = editable.getSpanStart(null);
            int spanEnd = editable.getSpanEnd(null);
            selectionStart = Math.min(spanStart, selectionStart);
            min = Math.max(spanEnd, min);
        }
        int max3 = Math.max(selectionStart, 0);
        int min2 = Math.min(min, editable.length());
        bVar.beginBatchEdit();
        editable.delete(max3, min2);
        bVar.endBatchEdit();
        return true;
    }

    @Override // X3.c
    public void a(Object obj) {
        ((List) obj).clear();
    }

    @Override // B4.g
    public s b() {
        return new C1986n(-9223372036854775807L);
    }

    @Override // O7.a
    public long c() {
        return System.currentTimeMillis();
    }

    @Override // D3.a
    public Bitmap d(int i7, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i7, i10, config);
    }

    @Override // N0.p
    public Typeface e(N0.m mVar, k kVar, int i7) {
        mVar.getClass();
        return t("sans-serif", kVar, i7);
    }

    @Override // D3.a
    public Bitmap f(int i7, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i7, i10, config);
    }

    @Override // D3.a
    public void g(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // Q5.c
    public h h(Context context, String str, Q5.b bVar) {
        h hVar = new h();
        int c10 = bVar.c(context, str);
        hVar.f3537a = c10;
        if (c10 != 0) {
            hVar.f3539c = -1;
        } else {
            int d10 = bVar.d(context, str, true);
            hVar.f3538b = d10;
            if (d10 != 0) {
                hVar.f3539c = 1;
            }
        }
        return hVar;
    }

    @Override // X3.a
    public Object i() {
        try {
            return new E3.i(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // A2.a
    public CharSequence j(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f13569a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // D3.a
    public void k(int i7) {
    }

    @Override // V4.p
    public L l() {
        return new o(V4.l.f10107n, null);
    }

    @Override // J3.F
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // B4.g
    public long n(C1979g c1979g) {
        return -1L;
    }

    @Override // D3.a
    public void o() {
    }

    @Override // B4.g
    public void p(long j) {
    }

    @Override // N0.p
    public Typeface q(k kVar, int i7) {
        return t(null, kVar, i7);
    }

    @Override // J3.F
    public void r(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // V4.p
    public L s(V4.l lVar, V4.i iVar) {
        return new o(lVar, iVar);
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f4943a) {
            case 18:
                return new Boolean(zzpe.zza());
            case 19:
                List list = Y5.F.f11304a;
                return Boolean.valueOf(zzql.zzd());
            case 20:
                List list2 = Y5.F.f11304a;
                return Integer.valueOf((int) zzoy.zzal());
            case 21:
                List list3 = Y5.F.f11304a;
                return zzoy.zzn();
            case 22:
                List list4 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzJ());
            case 23:
                List list5 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzR());
            case 24:
                List list6 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzah());
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                List list7 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzF());
            case 26:
                List list8 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzm());
            case 27:
                List list9 = Y5.F.f11304a;
                return zzqi.zzf();
            case 28:
                List list10 = Y5.F.f11304a;
                return Integer.valueOf((int) zzoy.zzs());
            default:
                List list11 = Y5.F.f11304a;
                return Integer.valueOf((int) zzoy.zzaj());
        }
    }
}
