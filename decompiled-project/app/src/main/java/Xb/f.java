package Xb;

import Eb.z;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f extends z {

    /* renamed from: a, reason: collision with root package name */
    public final int f11028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11029b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11030c;

    /* renamed from: d, reason: collision with root package name */
    public int f11031d;

    public f(int i7, int i10, int i11) {
        this.f11028a = i11;
        this.f11029b = i10;
        boolean z8 = false;
        if (i11 <= 0 ? i7 >= i10 : i7 <= i10) {
            z8 = true;
        }
        this.f11030c = z8;
        this.f11031d = z8 ? i7 : i10;
    }

    @Override // Eb.z
    public final int a() {
        int i7 = this.f11031d;
        if (i7 != this.f11029b) {
            this.f11031d = this.f11028a + i7;
        } else {
            if (!this.f11030c) {
                throw new NoSuchElementException();
            }
            this.f11030c = false;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11030c;
    }
}
