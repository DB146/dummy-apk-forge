package R4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final long f8850a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8851b;

    /* renamed from: c, reason: collision with root package name */
    public long f8852c;

    public b(long j, long j10) {
        this.f8850a = j;
        this.f8851b = j10;
        this.f8852c = j - 1;
    }

    public final void b() {
        long j = this.f8852c;
        if (j < this.f8850a || j > this.f8851b) {
            throw new NoSuchElementException();
        }
    }

    @Override // R4.l
    public final boolean next() {
        long j = this.f8852c + 1;
        this.f8852c = j;
        return !(j > this.f8851b);
    }
}
