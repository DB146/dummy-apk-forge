package k5;

import I2.C0330t;
import android.media.Spatializer;
import m4.L;
import n5.D;

/* renamed from: k5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1426e implements M6.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f18874a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r3.f18959h.g(r9, r3.f18960i) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0039, code lost:
    
        if (r5.equals("audio/ac4") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0014, B:10:0x0018, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:22:0x0069, B:24:0x006d, B:26:0x0071, B:28:0x0075, B:30:0x007f, B:32:0x008b, B:34:0x0096), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0014, B:10:0x0018, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:22:0x0069, B:24:0x006d, B:26:0x0071, B:28:0x0075, B:30:0x007f, B:32:0x008b, B:34:0x0096), top: B:3:0x000a }] */
    @Override // M6.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        boolean z8;
        C0330t c0330t;
        boolean isAvailable;
        boolean isEnabled;
        C0330t c0330t2;
        boolean z10 = false;
        char c10 = 2;
        q qVar = this.f18874a;
        L l10 = (L) obj;
        synchronized (qVar.f18955c) {
            try {
                if (qVar.g.f18920X && !qVar.f18958f && l10.f20075M > 2) {
                    String str = l10.f20096z;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187078297:
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                z8 = true;
                                break;
                        }
                        if (z8) {
                            if (D.f21141a >= 32 && (c0330t2 = qVar.f18959h) != null && c0330t2.f5199a) {
                            }
                        }
                        if (D.f21141a >= 32 && (c0330t = qVar.f18959h) != null && c0330t.f5199a) {
                            isAvailable = ((Spatializer) c0330t.f5200b).isAvailable();
                            if (isAvailable) {
                                isEnabled = ((Spatializer) qVar.f18959h.f5200b).isEnabled();
                                if (isEnabled) {
                                }
                            }
                        }
                    }
                    z8 = false;
                    if (z8) {
                    }
                    if (D.f21141a >= 32) {
                        isAvailable = ((Spatializer) c0330t.f5200b).isAvailable();
                        if (isAvailable) {
                        }
                    }
                }
                z10 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
