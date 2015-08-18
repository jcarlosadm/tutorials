package com.box.basic;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

public class BoxBasic extends ApplicationAdapter {
	SpriteBatch batch;
	Sprite sprite;
	Texture img;
	World world;
	Body body;
	Fixture fixture;
	
	float meters_to_pixels = 30f;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		sprite = new Sprite(img);
		
		sprite.setPosition(Gdx.graphics.getWidth()/2 - sprite.getWidth()/2, 
		        Gdx.graphics.getHeight()/2);
		
		world = new World(new Vector2(0, -9.8f), true);
		
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.DynamicBody;
		bodyDef.position.set(sprite.getX()/meters_to_pixels, sprite.getY()/meters_to_pixels);
		
		body = world.createBody(bodyDef);
		body.setLinearVelocity(0, 15f);
		//body.applyLinearImpulse(new Vector2(2f, 20f), body.getWorldCenter(), true);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox((sprite.getWidth()/2)/meters_to_pixels, 
		        (sprite.getHeight()/2)/meters_to_pixels);
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1f;
		
		fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
	}

	@Override
	public void render () {
	    
	    world.step(1f/60f, 6, 2);
	    System.out.println(body.getLinearVelocity().y);
	    
	    sprite.setPosition(body.getPosition().x*meters_to_pixels, 
	            body.getPosition().y*meters_to_pixels);
	    
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(sprite, sprite.getX(), sprite.getY());
		batch.end();
	}
	
	@Override
	public void dispose() {
	    img.dispose();
	    world.dispose();
	}
}
