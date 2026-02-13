package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import d3.AbstractC1045a;
import d3.C1046b;
import d3.InterfaceC1047c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1045a abstractC1045a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1047c interfaceC1047c = remoteActionCompat.f13258a;
        if (abstractC1045a.e(1)) {
            interfaceC1047c = abstractC1045a.h();
        }
        remoteActionCompat.f13258a = (IconCompat) interfaceC1047c;
        CharSequence charSequence = remoteActionCompat.f13259b;
        if (abstractC1045a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1046b) abstractC1045a).f16511e);
        }
        remoteActionCompat.f13259b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f13260c;
        if (abstractC1045a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1046b) abstractC1045a).f16511e);
        }
        remoteActionCompat.f13260c = charSequence2;
        remoteActionCompat.f13261d = (PendingIntent) abstractC1045a.g(remoteActionCompat.f13261d, 4);
        boolean z8 = remoteActionCompat.f13262e;
        if (abstractC1045a.e(5)) {
            z8 = ((C1046b) abstractC1045a).f16511e.readInt() != 0;
        }
        remoteActionCompat.f13262e = z8;
        boolean z10 = remoteActionCompat.f13263f;
        if (abstractC1045a.e(6)) {
            z10 = ((C1046b) abstractC1045a).f16511e.readInt() != 0;
        }
        remoteActionCompat.f13263f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1045a abstractC1045a) {
        abstractC1045a.getClass();
        IconCompat iconCompat = remoteActionCompat.f13258a;
        abstractC1045a.i(1);
        abstractC1045a.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f13259b;
        abstractC1045a.i(2);
        Parcel parcel = ((C1046b) abstractC1045a).f16511e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f13260c;
        abstractC1045a.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC1045a.k(remoteActionCompat.f13261d, 4);
        boolean z8 = remoteActionCompat.f13262e;
        abstractC1045a.i(5);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z10 = remoteActionCompat.f13263f;
        abstractC1045a.i(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
