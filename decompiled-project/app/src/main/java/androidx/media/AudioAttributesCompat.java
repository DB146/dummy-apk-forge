package androidx.media;

import android.util.SparseIntArray;
import d3.InterfaceC1047c;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC1047c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13558b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f13559a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f13559a;
        return audioAttributesImpl == null ? audioAttributesCompat.f13559a == null : audioAttributesImpl.equals(audioAttributesCompat.f13559a);
    }

    public final int hashCode() {
        return this.f13559a.hashCode();
    }

    public final String toString() {
        return this.f13559a.toString();
    }
}
