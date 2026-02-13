package E4;

import n5.D;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements w {

    /* renamed from: b, reason: collision with root package name */
    public static final r f3662b = new r(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3663a;

    public /* synthetic */ r(int i7) {
        this.f3663a = i7;
    }

    @Override // E4.w
    public int d(Object obj) {
        m mVar = (m) obj;
        switch (this.f3663a) {
            case 1:
                String str = mVar.f3581a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (D.f21141a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return mVar.f3581a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
