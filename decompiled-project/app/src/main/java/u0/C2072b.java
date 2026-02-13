package u0;

import B0.D;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import ea.C1108c;
import i0.C1289b;
import java.util.ArrayList;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2072b {

    /* renamed from: a, reason: collision with root package name */
    public long f24740a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f24741b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f24742c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24743d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f24744e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f24745f = -1;

    /* JADX WARN: Removed duplicated region for block: B:52:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1108c a(D d10, MotionEvent motionEvent) {
        int i7;
        int i10;
        boolean z8;
        boolean z10;
        long j;
        long j10;
        long s3;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long G9;
        int toolType;
        int i11;
        int historySize;
        int i12;
        char c10;
        long j11;
        C2072b c2072b = this;
        D d11 = d10;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = c2072b.f24741b;
        SparseBooleanArray sparseBooleanArray = c2072b.f24742c;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != c2072b.f24744e || source != c2072b.f24745f) {
                c2072b.f24744e = toolType2;
                c2072b.f24745f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j12 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j13 = c2072b.f24740a;
                c2072b.f24740a = j13 + 1;
                sparseLongArray.put(pointerId, j13);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j14 = c2072b.f24740a;
                c2072b.f24740a = j14 + 1;
                sparseLongArray.put(pointerId2, j14);
            }
        }
        boolean z11 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z12 = actionMasked == 8;
        if (z11) {
            i7 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i7 = 1;
        }
        int actionIndex2 = actionMasked != i7 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = c2072b.f24743d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i13 = 0;
        while (i13 < pointerCount) {
            boolean z13 = (z11 || i13 == actionIndex2 || (z12 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i13);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (indexOfKey >= 0) {
                z10 = z11;
                z8 = z12;
                j = sparseLongArray.valueAt(indexOfKey);
            } else {
                z8 = z12;
                long j15 = c2072b.f24740a;
                z10 = z11;
                c2072b.f24740a = j15 + j12;
                sparseLongArray.put(pointerId3, j15);
                j = j15;
            }
            float pressure = motionEvent.getPressure(i13);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i13)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i13)) << 32);
            long a9 = C1289b.a(3, floatToRawIntBits2);
            if (i13 == 0) {
                floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                G9 = d11.G(floatToRawIntBits);
            } else if (Build.VERSION.SDK_INT >= 29) {
                rawX = motionEvent.getRawX(i13);
                rawY = motionEvent.getRawY(i13);
                floatToRawIntBits = (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
                G9 = d11.G(floatToRawIntBits);
            } else {
                j10 = floatToRawIntBits2;
                s3 = d11.s(floatToRawIntBits2);
                toolType = motionEvent.getToolType(i13);
                if (toolType != 0) {
                    if (toolType == 1) {
                        i11 = 1;
                    } else if (toolType == 2) {
                        i11 = 3;
                    } else if (toolType == 3) {
                        i11 = 2;
                    } else if (toolType == 4) {
                        i11 = 4;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    for (i12 = 0; i12 < historySize; i12++) {
                        float historicalX = motionEvent.getHistoricalX(i13, i12);
                        float historicalY = motionEvent.getHistoricalY(i13, i12);
                        if ((Float.floatToRawIntBits(historicalX) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040 && (Float.floatToRawIntBits(historicalY) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040) {
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(historicalX) << 32) | (Float.floatToRawIntBits(historicalY) & 4294967295L);
                            arrayList2.add(new C2071a(motionEvent.getHistoricalEventTime(i12), floatToRawIntBits3, floatToRawIntBits3));
                        }
                    }
                    if (motionEvent.getActionMasked() == 8) {
                        c10 = '\t';
                        j11 = (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << 32);
                    } else {
                        c10 = '\t';
                        j11 = 0;
                    }
                    arrayList.add(new C2082l(j, motionEvent.getEventTime(), s3, j10, z13, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i13), false), arrayList2, j11, a9));
                    i13++;
                    c2072b = this;
                    d11 = d10;
                    z12 = z8;
                    z11 = z10;
                    j12 = 1;
                }
                i11 = 0;
                ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i12 < historySize) {
                }
                if (motionEvent.getActionMasked() == 8) {
                }
                arrayList.add(new C2082l(j, motionEvent.getEventTime(), s3, j10, z13, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i13), false), arrayList22, j11, a9));
                i13++;
                c2072b = this;
                d11 = d10;
                z12 = z8;
                z11 = z10;
                j12 = 1;
            }
            s3 = floatToRawIntBits;
            j10 = G9;
            toolType = motionEvent.getToolType(i13);
            if (toolType != 0) {
            }
            i11 = 0;
            ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            while (i12 < historySize) {
            }
            if (motionEvent.getActionMasked() == 8) {
            }
            arrayList.add(new C2082l(j, motionEvent.getEventTime(), s3, j10, z13, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i13), false), arrayList222, j11, a9));
            i13++;
            c2072b = this;
            d11 = d10;
            z12 = z8;
            z11 = z10;
            j12 = 1;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i10 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i10 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i14 = i10;
                while (true) {
                    if (i14 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i14) == keyAt) {
                        break;
                    }
                    i14++;
                }
            }
        }
        motionEvent.getEventTime();
        return new C1108c(15, arrayList, motionEvent);
    }
}
