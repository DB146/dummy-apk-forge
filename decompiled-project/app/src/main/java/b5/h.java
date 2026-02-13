package b5;

import a5.k;

/* loaded from: classes.dex */
public final class h extends k implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public long f13967x;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (i(4) == hVar.i(4)) {
            long j = this.f23460f - hVar.f23460f;
            if (j == 0) {
                j = this.f13967x - hVar.f13967x;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!i(4)) {
            return -1;
        }
        return 1;
    }
}
