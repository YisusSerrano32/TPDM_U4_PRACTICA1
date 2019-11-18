package jesusserrano.ittepic.edu.tpdm_u4_practica1_15401058

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(context: Context?) : View(context) {

    var luna = BitmapFactory.decodeResource(resources,R.drawable.luna2)
    override fun onDraw(c: Canvas){
        super.onDraw(c)

        val p = Paint()
        // Resolucion 1520 x 720
        setBackgroundColor(Color.rgb(37,40,80))

        p.color = Color.rgb(220,220,220)
        c.drawCircle(300f,950f,600f,p) //Montaña 1
        c.drawCircle(1200f,1050f,700f,p) //Montaña 2

        p.color = Color.rgb(70,35,0) //Color cafe
        c.drawRect(300f,400f,360f,550f,p) //Tronco arbol izquierdo

        p.color = Color.rgb(0,53,0) //Color verde
        c.drawCircle(330f,340f,100f,p) //Hojas
        c.drawCircle(290f,310f,100f,p)
        c.drawCircle(370f,310f,100f,p)
        c.drawCircle(280f,300f,70f,p)
        c.drawCircle(380f,300f,70f,p)
        c.drawCircle(330f,260f,90f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.rgb(0,0,0)
        c.drawCircle(1000f,550f,60f,p)// Muñeco abajo
        c.drawCircle(1000f,450f,40f,p)//Muñeco arriba
        c.drawArc(980f,455f,1020f,475f,0f,180f,false,p) // Sonrisa
        p.style = Paint.Style.FILL
        c.drawRect(965f,405f,1035f,425f,p)
        c.drawRoundRect(980f,360f,1020f,425f,10f,10f,p)
        p.color = Color.rgb(242,0,0)
        c.drawRect(980f,395f,1020f,405f,p)



        p.color = Color.rgb(242,121,0)
        p.style = Paint.Style.STROKE
        c.drawLine(1000f,455f,1030f,460f,p) //Nariz

        p.color = Color.rgb(0,0,0)
        c.drawCircle(988f,440f,2f,p) //Ojo izquierdo
        c.drawCircle(1012f,440f,2f,p) // Ojo derecho

        p.style = Paint.Style.FILL
        p.color = Color.rgb(70,35,0)
        c.drawRect(1250f,450f,1320f,620f,p)

        p.color = Color.rgb(0,70,0)
        c.drawBitmap(luna,1000f,30f,p)
        c.drawCircle(1285f,410f,110f,p)
        c.drawCircle(1285f,300f,85f,p)
        c.drawCircle(1285f,200f,70f,p)

        p.color = Color.rgb(140,170,200)
        c.drawOval(200f,50f,400f,125f,p)
        c.drawOval(350f,50f,550f,130f,p)
        c.drawOval(290f,20f,450f,100f,p)
        c.drawOval(450f,60f,570f,90f,p)


    }
}