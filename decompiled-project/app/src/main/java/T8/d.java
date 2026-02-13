package T8;

import android.media.MediaPlayer;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i7, int i10) {
        Log.w("O", "Failed to beep " + i7 + ", " + i10);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }
}
