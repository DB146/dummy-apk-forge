package A4;

import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f488a;

    /* renamed from: b, reason: collision with root package name */
    public final String f489b;

    /* renamed from: c, reason: collision with root package name */
    public final s4.u f490c;

    /* renamed from: d, reason: collision with root package name */
    public final int f491d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f492e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r7.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(boolean z8, String str, int i7, byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = 2;
        char c10 = 0;
        AbstractC1705a.h((i7 == 0) ^ (bArr2 == null));
        this.f488a = z8;
        this.f489b = str;
        this.f491d = i7;
        this.f492e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
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
                    break;
                default:
                    AbstractC1705a.S("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i12 = 1;
                    break;
            }
            this.f490c = new s4.u(i12, bArr, i10, i11);
        }
        i12 = 1;
        this.f490c = new s4.u(i12, bArr, i10, i11);
    }
}
