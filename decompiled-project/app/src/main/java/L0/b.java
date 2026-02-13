package L0;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class b implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f6231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6232b;

    /* renamed from: c, reason: collision with root package name */
    public int f6233c = 0;

    public b(CharSequence charSequence, int i7) {
        this.f6231a = charSequence;
        this.f6232b = i7;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i7 = this.f6233c;
        if (i7 == this.f6232b) {
            return (char) 65535;
        }
        return this.f6231a.charAt(i7);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f6233c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f6232b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f6233c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i7 = this.f6232b;
        if (i7 == 0) {
            this.f6233c = i7;
            return (char) 65535;
        }
        int i10 = i7 - 1;
        this.f6233c = i10;
        return this.f6231a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i7 = this.f6233c + 1;
        this.f6233c = i7;
        int i10 = this.f6232b;
        if (i7 < i10) {
            return this.f6231a.charAt(i7);
        }
        this.f6233c = i10;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i7 = this.f6233c;
        if (i7 <= 0) {
            return (char) 65535;
        }
        int i10 = i7 - 1;
        this.f6233c = i10;
        return this.f6231a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i7) {
        if (i7 > this.f6232b || i7 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f6233c = i7;
        return current();
    }
}
